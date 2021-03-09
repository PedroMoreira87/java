package aula06_trasbalho;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.math.BigInteger;

public class KDC {
    private Pessoa bob;
    private Pessoa alice;
    private byte[] ksCifradaBob;
    private byte[] ksCifradaAlice;

    public KDC(Pessoa bob, Pessoa alice) {
        this.bob = bob;
        this.alice = alice;
    }

    public String getKS(){
        SecureRandom random = new SecureRandom();
        return new BigInteger(80, random).toString(32);
    }

    public void gerarChaveSessao(String id, byte[] idCifrado, byte[] destinatarioCifrado) throws BadPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, UnsupportedEncodingException, NoSuchPaddingException, InvalidKeyException {

        //Será que é realmente o bob?
        String idDecifrado = AES.decifra(idCifrado, bob.getChaveMestre());

        if(id.equals(idDecifrado)){
            String destinatario = AES.decifra(destinatarioCifrado, bob.getChaveMestre());
            if(destinatario.equals(alice.getId())){
                //Bob quer falar com a Alice
                String chaveSessao = getKS();
                this.ksCifradaBob = AES.cifra(chaveSessao, bob.getChaveMestre());
                this.ksCifradaAlice = AES.cifra(chaveSessao, alice.getChaveMestre());
            }
        }else{
            System.out.println("Deu ruim");
        }
    }

    public byte[] getKsCifradaBob() {
        return ksCifradaBob;
    }

    public byte[] getKsCifradaAlice() {
        return ksCifradaAlice;
    }
}
