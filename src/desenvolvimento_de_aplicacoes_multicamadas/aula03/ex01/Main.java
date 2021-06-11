package desenvolvimento_de_aplicacoes_multicamadas.aula03.ex01;

public class Main {
    public static void main(String[] args) {
        Porta porta1 = new Porta();

        porta1.setCor("Azul");
        porta1.imprimir();
        porta1.setAberta(true);
        porta1.imprimir();

        Casa casa1 = new Casa();

        casa1.porta = porta1;
    }
}
