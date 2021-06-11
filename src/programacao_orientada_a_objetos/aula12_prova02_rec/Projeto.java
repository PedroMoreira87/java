package programacao_orientada_a_objetos.aula12_prova02_rec;

import java.util.ArrayList;

public class Projeto {

    private ArrayList<FormaGeometrica> figuras;
    private String nome;

    public Projeto(String nome) {
        this.figuras = new ArrayList<>();
        this.nome = nome;
    }

    public static void main(String[] args) {

        Projeto projeto1 = new Projeto("Projeto: Desenho1");
        Projeto projeto2 = new Projeto("Projeto: Novo Desenho1");

        try{
            projeto1.addFiguras(new Circulo(1, 3));
            projeto1.addFiguras(new Retangulo(4, 6,10));
            projeto1.addFiguras(new Retangulo(1, 10,-15));
        }catch (ExcecaoMedidaIncorreta e){
            System.out.println(e.getMessage());
        }
        try{
            projeto2.addFiguras(new Retangulo(4, 4,10));
            projeto2.addFiguras(new Circulo(-3, 5));
        }catch (ExcecaoMedidaIncorreta e) {
            System.out.println(e.getMessage());
        }

        projeto1.imprimeProjeto();
        projeto2.imprimeProjeto();
    }

    public void addFiguras(FormaGeometrica form){
        this.figuras.add(form);
    }

    public void imprimeProjeto(){
        System.out.println(nome);
        System.out.println("=====================");

        for (FormaGeometrica i : figuras){
            i.imprime();
        }
    }
}
