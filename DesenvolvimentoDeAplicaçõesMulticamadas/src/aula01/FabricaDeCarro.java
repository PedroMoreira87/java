package aula01;

public class FabricaDeCarro {

    private static FabricaDeCarro instance;

    protected int totalCarrosFiat;
    protected int totalCarrosFord;
    protected int totalCarrosVolks;

    private FabricaDeCarro(){
        totalCarrosFiat = 0;
        totalCarrosFord = 0;
        totalCarrosVolks = 0;
    }

    public static FabricaDeCarro getInstance(){
        if(instance == null){
            instance = new FabricaDeCarro();
        }
        return instance;
    }

    public String criarCarroFiat(){
        totalCarrosFiat++;
        return new String ("Carro Fiat criado.");
    }

    public String criarCarroFord(){
        totalCarrosFord++;
        return new String ("Carro Ford criado.");
    }

    public String criarCarroVolks(){
        totalCarrosVolks++;
        return new String ("Carro Volks criado.");
    }

    public String gerarRelatorio(){
        return new String ("Fiat: " + totalCarrosFiat + "\nFord: " + totalCarrosFord + "\nVolks: " + totalCarrosVolks);
    }
}
