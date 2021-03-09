package aula09_2;

public class Som extends Documento {

    public Som(String nome, int endereco, int totalBlocos) {
        super(nome, endereco, totalBlocos);
    }

    void abrir(){
        System.out.println("Som aberto.");
    }

}
