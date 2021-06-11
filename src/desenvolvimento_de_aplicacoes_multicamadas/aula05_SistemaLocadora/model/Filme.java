package desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.model;

public class Filme {
    
    private int id;
    private String titulo;
    private int id_locadora;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId_locadora() {
        return id_locadora;
    }

    public void setId_locadora(int id_locadora) {
        this.id_locadora = id_locadora;
    }
   
}
