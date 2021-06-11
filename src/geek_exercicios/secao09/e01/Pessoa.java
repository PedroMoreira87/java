package secao09.e01;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    // exemplo usando contrutor com setters
    public Pessoa(String nome, int idade, double altura){
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void imprimirPessoa(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
    }
}
