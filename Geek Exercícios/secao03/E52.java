package secao03;

public class E52 {
    public static void main(String[] args) {

        int amigo1 = 50;
        int amigo2 = 100;
        int amigo3 = 25;
        int totalInvestido = amigo1 + amigo2 + amigo3;
        int valorPremio = 100000;

        double recebeu1 = (double) amigo1 / totalInvestido *  valorPremio;
        double recebeu2 = (double) amigo2 / totalInvestido *  valorPremio;
        double recebeu3 = (double) amigo3 / totalInvestido *  valorPremio;

        double provaReal = recebeu1 + recebeu2 + recebeu3;

        System.out.printf("R$%.2f%n", provaReal);
        System.out.printf("Amigo 1 recebeu: R$%.2f%n" + "Amigo 2 recebeu: R$%.2f%n" + "Amigo 3 recebeu: R$%.2f", recebeu1, recebeu2, recebeu3);
    }
}

