package desenvolvimento_de_aplicacoes_multicamadas.builder;

public class CarroErrado {

    private String placa;
    private String modelo;
    private int ano;
    private String cor;
    private String motor;
    private String nomeDono;
    private String combustivel;

    public CarroErrado(String placa, String modelo, int ano, String cor, String motor, String nomeDono, String combustivel) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.motor = motor;
        this.nomeDono = nomeDono;
        this.combustivel = combustivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void imprimir(){
        System.out.println("Placa: " + getPlaca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Cor: " + getCor());
        System.out.println("Motor: " + getMotor());
        System.out.println("Nome do dono: " + getNomeDono());
        System.out.println("Combustível: " + getCombustivel());
        System.out.println("============================================");
    }
}
