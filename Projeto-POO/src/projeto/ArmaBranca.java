package projeto;

public class ArmaBranca extends Arma{
    private String material;
    private String lamina;

    public ArmaBranca(String nome, String modelo, String preco, String material, String lamina) {
        super(nome, modelo, preco);
        this.material = material;
        this.lamina = lamina;
    }

    public String getMaterial() {
        return material;
    }

    public String getLamina() {
        return lamina;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLamina(String lamina) {
        this.lamina = lamina;
    }

    @Override
    public String toString() {
        return  "--------------------------\n" +
                "Arma Branca: \n" +
                "--------------------------\n" +
                "Nome: " + getNome() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Preço: " + getPreco() + "\n" +
                "Material: " + getMaterial() + "\n" +
                "Lâmina: " + getLamina() + "\n";
    }
}
