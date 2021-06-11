package programacao_orientada_a_objetos.aula14;

import java.io.Serializable;

public abstract class Mamifero implements Serializable {

    private String nome;
    private int idade;
    private String dono;
    protected String especie;

    public Mamifero(String nome, int idade, String dono) {
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
    }

    @Override
    public String toString() {
        String retorno = "";
        retorno += "Nome:   "     + this.nome     + "\n";
        retorno += "Idade:  "    + this.idade    + " anos\n";
        retorno += "Dono:   "     + this.dono     + "\n";
        retorno += "Especie: "  + this.especie  + "\n";
        retorno += "Barulho: "  + soar()        + "\n";
        return retorno;
    }

    public abstract String soar();

}
