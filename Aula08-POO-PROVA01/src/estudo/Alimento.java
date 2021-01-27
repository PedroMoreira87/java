package estudo;

public class Alimento {
    private String nome;
    private String categoria;
    private String marca;
    private double preco;
    private int quantidade;

    public Alimento(String nome, String categoria, String marca, double preco, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void imprimirAlimento(){
        System.out.println("Nome do Alimento: " + getNome());
        System.out.println("- Marca: " + getMarca());
        System.out.println("- Categoria: " + getCategoria());
        System.out.println("- Preço: R$ " + getPreco());
        System.out.println("- Quantidade: " + getQuantidade());
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
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
