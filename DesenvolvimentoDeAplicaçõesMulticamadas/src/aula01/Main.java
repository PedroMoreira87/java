package aula01;

public class Main {

    public static void main(String[] args) {

        FabricaDeCarro fabrica = FabricaDeCarro.getInstance();

        System.out.println(fabrica.criarCarroFiat());
        System.out.println(fabrica.criarCarroFiat());
        System.out.println(fabrica.criarCarroFord());
        System.out.println(fabrica.criarCarroVolks());

        System.out.println(fabrica.gerarRelatorio());

        System.out.println("\n\n\n");

        FabricaDeCarro fabrica2 = FabricaDeCarro.getInstance();

        System.out.println(fabrica2.criarCarroFiat());

        System.out.println(fabrica2.gerarRelatorio());

    }
}
