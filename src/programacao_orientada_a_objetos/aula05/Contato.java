package aula05;

import java.util.ArrayList;

public class Contato {
    private String nomeContato;
    private ArrayList <Mensagem> mensagens;


    public Contato (String nomeContato) {
        this.nomeContato = nomeContato;
        this.mensagens = new ArrayList <Mensagem>();
    }

    public ArrayList<Mensagem> getMensagens() {
        return this.mensagens;
    }

    public String getNomeContato() {
        return this.nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public void imprimirMensagens() {
        for(Mensagem msg: this.mensagens) {
            System.out.println(msg.getTexto());
        }
    }
}
