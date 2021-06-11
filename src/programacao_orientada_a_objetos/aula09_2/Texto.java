package aula09_2;

public class Texto extends Documento {

    public Texto(String nome, int endereco, int totalBlocos) {
        super(nome, endereco, totalBlocos);
    }

    void abrir(){
        System.out.println("Texto aberto.");
    }

}
