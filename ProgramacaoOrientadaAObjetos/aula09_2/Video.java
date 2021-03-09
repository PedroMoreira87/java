package aula09_2;

public class Video extends Documento {

    public Video(String nome, int endereco, int totalBlocos) {
        super(nome, endereco, totalBlocos);
    }

    void abrir(){
        System.out.println("Video aberto.");
    }

}
