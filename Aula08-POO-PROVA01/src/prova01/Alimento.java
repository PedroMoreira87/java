package prova01;

public class Alimento {

    private String nome;
    private String marca;
    private String categoria;
    private double preco;
    private int quantidade;

    public Alimento(String nome, String marca, String categoria, double preco, int quantidade) {
        this.nome = nome;
        this.marca = marca;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void imprimirAlimento(){
        System.out.println("Nome do Produto: " + getNome());
        System.out.println("- Marca: " + getMarca());
        System.out.println("- Categoria: " + getCategoria());
        System.out.println("- Preço: R$" + getPreco());
        System.out.println("- Quantidade: " + getQuantidade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
