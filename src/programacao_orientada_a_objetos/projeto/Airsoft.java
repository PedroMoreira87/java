package programacao_orientada_a_objetos.projeto;

public class Airsoft extends Arma{
    private String fps;
    private String tipo;

    public Airsoft(String nome, String modelo, String preco, String fps, String tipo) {
        super(nome, modelo, preco);
        this.fps = fps;
        this.tipo = tipo;
    }

    public String getFps() {
        return fps;
    }

    public String getTipo() {
        return tipo;
    }

    public void setFps(String fps) {
        this.fps = fps;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  "--------------------------\n" +
                "Airsoft: \n" +
                "--------------------------\n" +
                "Nome: " + getNome() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Preço: " + getPreco() + "\n" +
                "FPS: " + getFps() + "\n" +
                "Tipo: " + getTipo() + "\n";
    }
}
