package estudo_prova01;

import java.util.ArrayList;

public class Mercado {
    private String nome;
    private  static ArrayList<Alimento> alimentos;
    private static ArrayList<Utilidade> utilidades;

    public Mercado(String nome) {
        this.nome = nome;
        alimentos = new ArrayList<>();
        utilidades = new ArrayList<>();
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

    public double maisBarato(){
        double maisBarato = alimentos.get(0).getPreco();
        for (Alimento i : alimentos){
            if (i.getPreco() < maisBarato){
                maisBarato = i.getPreco();
            }
        }return maisBarato;
    }


    public void maisBaratoPrint(){
        System.out.printf("\nMenor valor = R$ %.2f: (%s)", maisBarato(), alimentos.get(3).getNome());
    }

    public static void main(String[] args) {

        Mercado mercado = new Mercado("*** Mercado: Condor ***\n");
        Alimento alimento01 = new Alimento("KitKat Dark", "Chocolate", "Nestle", 2.55, 530);
        Alimento alimento02 = new Alimento("Iogurte Natural", "Laticinio", "Nestle", 2.25, 500);
        Alimento alimento03 = new Alimento("Batata Frita", "Snacks", "Elma Chips", 4.35, 200);
        Alimento alimento04 = new Alimento("Traquinas", "Bolacha", "Mondelez", 1.90, 602);
        Alimento alimento05 = new Alimento("Doritos", "Snacks", "Elma Chips", 4.70, 900);
        Utilidade utilidade01 = new Utilidade("Copo Americano", "Copo", "Nadir Figueredo", 2.50, 250);
        Utilidade utilidade02 = new Utilidade("Bule Termico", "Garrafa Termica", "Sanremo", 45, 20);
        Utilidade utilidade03 = new Utilidade("Travesseiro Leve", "Travesseiro", "Zelo", 120.88, 30);

        alimentos.add(alimento01);
        alimentos.add(alimento02);
        alimentos.add(alimento03);
        alimentos.add(alimento04);
        alimentos.add(alimento05);
        utilidades.add(utilidade01);
        utilidades.add(utilidade02);
        utilidades.add(utilidade03);

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

        mercado.maisBaratoPrint();

    }
}
