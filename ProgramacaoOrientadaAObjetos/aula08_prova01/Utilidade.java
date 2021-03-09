package aula08_prova01;

public class Utilidade {

    private String nome;
    private String tipo;
    private String marca;
    private double preco;
    private int quantidade;

    public Utilidade(String nome, String tipo, String marca, double preco, int quantide) {
        this.nome = nome;
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantide;
    }

    public void imprimirUtilidade(){
        System.out.println("Nome: " + getNome());
        System.out.println("- Tipo: " + getTipo());
        System.out.println("- Marca: " + getMarca());
        System.out.println("- Preço: R$" + getPreco());
        System.out.println("- Quantidade: " + getQuantidade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
