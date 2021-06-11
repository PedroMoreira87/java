package desenvolvimento_de_aplicacoes_multicamadas.aula03.ex01;

public class Porta {

    private boolean aberta;
    private String cor;

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean estaAberta() {
        return aberta;
    }

    public void imprimir(){
        System.out.println("A porta está aberta? " + aberta);
        System.out.println("A cor da porta é: " + cor);
    }
}
