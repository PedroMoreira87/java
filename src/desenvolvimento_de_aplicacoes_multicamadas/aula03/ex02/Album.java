package desenvolvimento_de_aplicacoes_multicamadas.aula03.ex02;

import java.util.ArrayList;

public class Album {

    private String genero;
    private int ano;
    private String nome;
    private Pessoa artista;
    private ArrayList<Musica> musicas;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getArtista() {
        return artista;
    }

    public void setArtista(Pessoa artista) {
        this.artista = artista;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(Musica m) {
        this.musicas.add(m);
    }

    public Album(String genero, int ano, String nome, Pessoa artista) {
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicas = new ArrayList<>();
    }

    public void mostrarTodosDados() {
        System.out.println("***** Dados do Album *****");
        System.out.println("Título: " + this.nome);
        System.out.println("Ano: " + this.ano);
        System.out.println("Genero: " + this.genero);

        System.out.println("Nome Artista: " + this.artista.getNome());
        System.out.println("CPF: " + this.artista.getCpf());

        for (int i = 0; i < this.musicas.size(); i++) {
            System.out.println("(" + i + ") " + this.musicas.get(i).getTitulo());
        }
    }
}
