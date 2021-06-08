package aula08_prova01;

import java.util.ArrayList;

public class Mercado {
    private String nome;
    private ArrayList<Alimento> alimentos;
    private ArrayList<Utilidade> utilidades;

    public Mercado(String nome, ArrayList<Alimento> alimentos, ArrayList<Utilidade> utilidades) {
        this.nome = nome;
        this.alimentos = alimentos;
        this.utilidades = utilidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public ArrayList<Utilidade> getUtilidades() {
        return utilidades;
    }

    public void setUtilidades(ArrayList<Utilidade> utilidades) {
        this.utilidades = utilidades;
    }

    public void imprimirMercado(){
        System.out.println(nome);
    }

    public double totalValorAlimentos(){
        double a = 0;
        for (Alimento i : alimentos){
            a += i.getQuantidade() * i.getPreco();
        }return a;
    }

    public double totalValorUtilidades(){
        double a = 0;
        for (Utilidade i : utilidades){
            a += i.getQuantidade() * i.getPreco();
        }return a;
    }

    public void maisBarato(){
        double maisBarato = alimentos.get(0).getPreco();
        String nome = alimentos.get(0).getNome();
        for (Alimento i : alimentos){
            if (i.getPreco() < maisBarato){
                maisBarato = i.getPreco();
                nome = i.getNome();
            }
        }System.out.printf("\nMenor valor = R$ %.2f: (%s)", maisBarato, nome);
    }

    public static void main(String[] args) {

        Mercado mercado = new Mercado("*** Mercado: Condor ***\n", new ArrayList<>(), new ArrayList<>());

        Alimento alimento01 = new Alimento("KitKat Dark", "Chocolate", "Nestle", 2.55, 530);
        Alimento alimento02 = new Alimento("Iogurte Natural", "Laticinio", "Nestle", 2.25, 500);
        Alimento alimento03 = new Alimento("Batata Frita", "Snacks", "Elma Chips", 4.35, 200);
        Alimento alimento04 = new Alimento("Traquinas", "Bolacha", "Mondelez", 1.90, 602);
        Alimento alimento05 = new Alimento("Doritos", "Snacks", "Elma Chips", 4.70, 900);
        Utilidade utilidade01 = new Utilidade("Copo Americano", "Copo", "Nadir Figueredo", 2.50, 250);
        Utilidade utilidade02 = new Utilidade("Bule Termico", "Garrafa Termica", "Sanremo", 45, 20);
        Utilidade utilidade03 = new Utilidade("Travesseiro Leve", "Travesseiro", "Zelo", 120.88, 30);

        mercado.getAlimentos().add(alimento01);
        mercado.getAlimentos().add(alimento02);
        mercado.getAlimentos().add(alimento03);
        mercado.getAlimentos().add(alimento04);
        mercado.getAlimentos().add(alimento05);
        mercado.getUtilidades().add(utilidade01);
        mercado.getUtilidades().add(utilidade02);
        mercado.getUtilidades().add(utilidade03);

        mercado.imprimirMercado();
        System.out.println("Alimentos");
        System.out.println("-----------------");
        System.out.println("Valor total = R$ " + mercado.totalValorAlimentos() + "\n");
        alimento01.imprimirAlimento();
        alimento02.imprimirAlimento();
        alimento03.imprimirAlimento();
        alimento04.imprimirAlimento();
        alimento05.imprimirAlimento();

        System.out.println("\nUtilidades domesticas");
        System.out.println("-----------------");
        System.out.println("Valor total = R$ " + mercado.totalValorUtilidades() + "\n");
        utilidade01.imprimirUtilidade();
        utilidade02.imprimirUtilidade();
        utilidade03.imprimirUtilidade();

        mercado.maisBarato();
    }
}
