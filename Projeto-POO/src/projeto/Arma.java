package projeto;

import java.io.Serializable;

public abstract class Arma implements Serializable {
    private String nome;
    private String modelo;
    private String preco;

    public Arma(String nome, String modelo, String preco) {
        this.nome = nome;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "--------------------------\n" +
                "Arma: \n" +
                "--------------------------\n" +
                "Nome: " + getNome() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Preco: " + getPreco() + "\n";
    }


}
