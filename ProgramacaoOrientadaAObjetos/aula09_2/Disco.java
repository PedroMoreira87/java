package aula09_2;
import java.util.ArrayList;

public class Disco {

    char nome;
    ArrayList<Pasta> listaDePastas = new ArrayList<>();;

    public Disco(char nome){
        this.nome = nome;
    }

    Pasta criarPasta(String nome){
        Pasta pasta = new Pasta();
        pasta.nome = nome;
        listaDePastas.add(pasta);
        return pasta;
    }

    void removerPasta(String nome){
        for(Pasta pasta : listaDePastas) {
            if(pasta.nome.equals(nome)) {
                listaDePastas.remove(pasta);
                return;
            }
        }
    }

    void listarPastas(){
        for(Pasta pasta: listaDePastas) {
            System.out.println("- " + pasta.nome);
        }
        System.out.println();
    }

}
