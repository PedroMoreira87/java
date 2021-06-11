package programacao_orientada_a_objetos.aula14;

public class Gato extends Mamifero{


    public Gato(String nome, int idade, String dono) {
        super(nome, idade, dono);
        this.especie = "Gato";
    }

    @Override
    public String soar() {
        return "Som de gato";
    }
}
