package programacao_orientada_a_objetos.aula09_2;
public class Apresentacao extends Documento {

    public Apresentacao(String nome, int endereco, int totalBlocos) {
        super(nome, endereco, totalBlocos);
    }

    void abrir(){
        System.out.println("Apresentacao aberto.");
    }

}
