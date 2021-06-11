package desenvolvimento_de_aplicacoes_multicamadas.builder;

public class Carro {

    private String placa;
    private String modelo;
    private int ano;
    private String cor;
    private String motor;
    private String nomeDono;
    private String combustivel;

    public static class Builder {

        private String placa; // Isso é importante, então vamos passar para o construtor.
        private String modelo;
        private int ano;
        private String cor;
        private String motor;
        private String nomeDono;
        private String combustivel;

        public Builder(String placa) {
            this.placa = placa;
        }

        public Builder modelo(String modelo){
            this.modelo = modelo;

            return this;  // Ao retornar o construtor a cada vez, podemos criar uma interface fluente.
        }

        public Builder ano(int ano){
            this.ano = ano;

            return this;
        }

        public Builder cor(String cor){
            this.cor = cor;

            return this;
        }

        public Builder motor(String motor){
            this.motor = motor;

            return this;
        }

        public Builder nomeDono(String nomeDono){
            this.nomeDono = nomeDono;

            return this;
        }

        public Builder combustivel(String combustivel){
            this.combustivel = combustivel;

            return this;
        }

        public Carro build(){
            // Aqui criamos o objeto de carro real, que está sempre em um estado totalmente inicializado quando é retornado.
            Carro carro01 = new Carro();  // Como o construtor está na classe Carro, podemos invocar seu construtor privado.
            carro01.placa = this.placa;
            carro01.modelo = this.modelo;
            carro01.ano = this.ano;
            carro01.cor = this.cor;
            carro01.motor = this.motor;
            carro01.nomeDono = this.nomeDono;
            carro01.combustivel = this.combustivel;

            return carro01;
        }
    }

    private Carro() {}

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
