package aula09_2;
public class Imagem extends Documento {

    public Imagem(String nome, int endereco, int totalBlocos) {
        super(nome, endereco, totalBlocos);
    }

    void abrir(){
        System.out.println("Imagem aberto.");
    }

}
