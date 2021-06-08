package aula08_prova01;

public class Utilidade {

    private String nome;
    private String tipo;
    private String marca;
    private double preco;
    private int quantidade;

    public Utilidade(String nome, String tipo, String marca, double preco, int quantidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void imprimirUtilidade(){
        System.out.println("Nome: " + getNome());
        System.out.println("- Tipo: " + getTipo());
        System.out.println("- Marca: " + getMarca());
        System.out.println("- Preco: R$  " + getPreco());
        System.out.println("- Quantidade: " + getQuantidade());
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
