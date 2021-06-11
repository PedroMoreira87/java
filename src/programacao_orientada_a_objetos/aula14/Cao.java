package programacao_orientada_a_objetos.aula14;

public class Cao extends Mamifero{


    public Cao(String nome, int idade, String dono) {
        super(nome, idade, dono);
        this.especie = "Cachorro";
    }

    @Override
    public String soar() {
        return "Som de cachorro";
    }
}
