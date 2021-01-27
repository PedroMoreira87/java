package projeto;

public class ArmaDeFogo extends Arma{
    private String calibre;
    private String capacidade;

    public ArmaDeFogo(String nome, String modelo, String preco, String calibre, String capacidade) {
        super(nome, modelo, preco);
        this.calibre = calibre;
        this.capacidade = capacidade;
    }

    public String getCalibre() {
        return calibre;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCalibre(String calibre) {
        this.calibre = calibre;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return  "--------------------------\n" +
                "Arma De Fogo: \n" +
                "--------------------------\n" +
                "Nome: " + getNome() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Preço: " + getPreco() + "\n" +
                "Calibre: " + getCalibre() + "\n" +
                "Capacidade: " + getCapacidade() + "\n";
    }
}
