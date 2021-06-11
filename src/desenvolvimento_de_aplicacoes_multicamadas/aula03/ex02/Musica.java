package desenvolvimento_de_aplicacoes_multicamadas.aula03.ex02;

public class Musica {

    private String titulo;
    private Double duracao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public Musica(String titulo, Double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public void tocarMusica() {
        System.out.println("Tocando a música " + this.titulo);
    }
}
