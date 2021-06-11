package seguranca_da_informacao.aula06_trabalho;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Principal {
    public static void main(String[] args) throws BadPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, UnsupportedEncodingException, NoSuchPaddingException, InvalidKeyException {
        Pessoa bob = new Pessoa ("bob", "bolabolabolabola");
        Pessoa alice = new Pessoa("alice", "patopatopatopato");

        KDC kdc = new KDC(bob, alice);

        //Identificador
        String p1 = bob.getId();
        //Identificador cifrado na k_bob
        byte[] p2 = AES.cifra(bob.getId(), bob.getChaveMestre());
        //Alice cifrado na k_bob
        byte[] p3 = AES.cifra(alice.getId(), bob.getChaveMestre());

        kdc.gerarChaveSessao(p1, p2, p3);
        kdc.getKsCifradaBob();
        kdc.getKsCifradaAlice();

        //12.	Bob verifica AES (K_S, k_bob) obtendo a chave de sessão
        String ksDecifradoBob = AES.decifra(kdc.getKsCifradaBob(), bob.getChaveMestre());
        //13.	Bob envia AES (K_S, k_alice) para alice
        //14.	Alice verifica AES (K_S, k_alice) obtendo a chave de sessão
        String ksDecifradoAlice = AES.decifra(kdc.getKsCifradaAlice(), alice.getChaveMestre());
//        System.out.printf("%s\n" + "%s", ksDecifradoBob, ksDecifradoAlice); -------------- teste
        //15.	Alice gera o nonce, cifra na chave de sessão AES (nonce, K_S) obtendo um número X e envia para Bob
//        System.out.println(alice.getNonce()); -------------- teste e duvida porque gera numeros diferentes
        String nonce = alice.getNonce();
//        System.out.println(nonce); -------------- teste e duvida porque gera numeros diferentes
        byte[] nonceCifrado = AES.cifra(nonce, ksDecifradoAlice);
        //16.	Bob verifica AES (X, K_S) obtendo o nonce
        String nonceDecifra = AES.decifra(nonceCifrado, ksDecifradoBob);
//        System.out.println(nonceDecifra); -------------- teste
        //17.	Bob utiliza a função de autenticação com o nonce gerando new nonce
        int newNonceBob = bob.getFuncAutentica(Integer.parseInt(nonceDecifra));
//        System.out.println(newNonceBob); -------------- teste
        //18.	Bob cifra new nonce na chave de sessão AES (new nonce, K_S) e envia para Alice
        byte[] newNonceCifrado = AES.cifra(Integer.toString(newNonceBob), ksDecifradoBob);
        //19.	Alice verifica AES (Y, K_S) obtendo new nonce
        String newNonceDecifra = AES.decifra(newNonceCifrado, ksDecifradoAlice);
//        System.out.println(newNonceDecifra); -------------- teste
        //20.	Alice aplica nonce na função de autenticação e verifica se é igual ao new nonce de Bob
        int newNonceAlice = alice.getFuncAutentica(Integer.parseInt(nonceDecifra));
            if (newNonceAlice == Integer.parseInt(newNonceDecifra)){
                System.out.println("Estou realmente falando com Bob");
            }else{
                System.out.println("Não é o Bob");
            }
    }
}
