package secao09.e02;

import java.util.ArrayList;

public class Agenda {
    private String nome;
    private int idade;
    private float altura;
    ArrayList<Agenda> pessoas = new ArrayList<>();

    // o metodo construtor tem o mesmo nome da classe
    public Agenda(String nome, int idade, float altura) {
        // this significa este objeto
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // you cannot call add with 3 parameters.
    // the IDE assume that you want to call the add version with 3 parameters but it's privated so it raises error.
    // you have to wrap your Agenda in a class, make a constructor and add it to your list:
    public void armazenaPessoa(String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        pessoas.add(new Agenda(nome, idade, altura));
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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void removePessoa(String nome){
        this.nome = nome;
    }

    public int buscaPessoa(String nome){
        return idade;
    }

    public void imprimeAgenda(){

    }

    public void imprimePessoa(int index){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
    }

}
