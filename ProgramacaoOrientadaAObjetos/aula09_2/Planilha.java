package aula09_2;

public class Planilha extends Documento {

    public Planilha(String nome, int endereco, int totalBlocos) {
        super(nome, endereco, totalBlocos);
    }

    void abrir(){
        System.out.println("Planilha aberto.");
    }

}
