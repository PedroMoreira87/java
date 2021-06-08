package orientacao_a_objetos_basica02;

import java.util.ArrayList;

public class Pais {

    private String iso;
    private String nome;
    private int populacao;
    private double dimensao;
    private ArrayList<String> fronteira;

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public ArrayList<String> getFronteira() {
        return fronteira;
    }

    public void setFronteira(String fronteira) {
        this.fronteira.add(fronteira);
    }

    public Pais(String iso, String nome, double dimensao, int populacao) {
        this.iso = iso;
        this.nome = nome;
        this.dimensao = dimensao;
        this.populacao = populacao;
        this.fronteira = new ArrayList<>();
    }

    public void imprimir () {
        System.out.println("Iso: " + this.iso);
        System.out.println("Nome: " + this.nome);
        System.out.println("Dimensão: " + this.dimensao);
        System.out.println("População: " + this.populacao);
        System.out.println("=================================");
    }

    public boolean isIgual(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pais pais = (Pais) obj;
        return this.iso.equals(pais.iso) &&
                this.nome.equals(pais.nome) &&
                this.dimensao == pais.dimensao;
    }

    public boolean isVizinho(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pais pais = (Pais) obj;
        return this.fronteira.contains(pais.nome);
    }

    public double densidade() {
        return this.populacao / this.dimensao;
    }
}
