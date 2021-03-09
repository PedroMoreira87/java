package aula08_prova01;

import java.util.ArrayList;

public class Mercado {
    private String nome;
    public static ArrayList<Alimento> alimentos;
    private static ArrayList<Utilidade> utilidades;

    public Mercado(String nome) {
        this.nome = nome;
        alimentos = new ArrayList<>();
        utilidades = new ArrayList<>();
    }

    public void imprimirMercado(){
        System.out.println(this.nome);
    }

    public double totalValorAlimentos(){
        double a = 0.00;

        for (Alimento i : alimentos){
            a += i.getQuantidade() * i.getPreco();
         }return a;
    }

    public void totalValorAlimentosPrint(){
        System.out.printf("Valor total = R$%.2f\n\n", totalValorAlimentos());
    }

    public double totalValorUtilidades(){
        double a = 0.00;

        for (Utilidade i : utilidades){
            a += i.getQuantidade() * i.getPreco();
        }return a;
    }

    public void totalValorUtilidadesPrint(){
        System.out.printf("Valor total = R$%.2f\n\n", totalValorUtilidades());
    }

    public double maisBarato(){
        double maisBarato = alimentos.get(0).getPreco();

        for (Alimento i : alimentos){
            if(i.getPreco() < maisBarato){
                maisBarato = i.getPreco();
            }
        }
        return maisBarato;
    }

    public void maisBaratoPrint(){
        System.out.printf("O alimento mais barato é %s: R$%.2f\n", alimentos.get(3).getNome(), maisBarato());
    }

    public static void main(String[] args) {

        Mercado mercado = new Mercado("*** Mercado: Condor ***\n");
        Alimento alimento01 = new Alimento("KitKat Dark", "Nestle", "Chocolate", 2.55, 530);
        Alimento alimento02 = new Alimento("Iogurte Natural", "Nestle", "Laticinio", 2.25, 500);
        Alimento alimento03 = new Alimento("Batata Frita", "Elma Chips", "Snacks", 4.35, 200);
        Alimento alimento04 = new Alimento("Traquinas", "Mondelez", "Bolacha", 1.90, 602);
        Alimento alimento05 = new Alimento("Doritos", "Elma Chips", "Snacks", 4.70, 900);
        alimentos.add(alimento01);
        alimentos.add(alimento02);
        alimentos.add(alimento03);
        alimentos.add(alimento04);
        alimentos.add(alimento05);

        mercado.imprimirMercado();
        System.out.println("Alimentos");
        System.out.println("-----------------------");
        mercado.totalValorAlimentosPrint();
        alimento01.imprimirAlimento();
        System.out.println();
        alimento02.imprimirAlimento();
        System.out.println();
        alimento03.imprimirAlimento();
        System.out.println();
        alimento04.imprimirAlimento();
        System.out.println();
        alimento05.imprimirAlimento();
        System.out.println();

        Utilidade utilidade01 = new Utilidade("Copo Americano", "Copo", "Nadir Figueredo", 2.50, 250);
        Utilidade utilidade02 = new Utilidade("Bule Termico", "Garrafa Termica", "Sanremo", 45, 20);
        Utilidade utilidade03 = new Utilidade("Travesseiro Leve", "Travesseiro", "Zelo", 120.88, 30);
        utilidades.add(utilidade01);
        utilidades.add(utilidade02);
        utilidades.add(utilidade03);

        System.out.println("Utilidades domesticas");
        System.out.println("-----------------------");
        mercado.totalValorUtilidadesPrint();
        utilidade01.imprimirUtilidade();
        System.out.println();
        utilidade02.imprimirUtilidade();
        System.out.println();
        utilidade03.imprimirUtilidade();
        System.out.println();

        System.out.println("-----------------------");
        mercado.maisBaratoPrint();
        System.out.println("-----------------------");
    }
}
