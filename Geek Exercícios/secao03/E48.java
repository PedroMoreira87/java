package secao03;

public class E48 {
    public static void main(String[] args) {
        int totalSegundos = 7230;
        double horas = (double) totalSegundos / 3600;
        double minutos = (double) (totalSegundos % 3600) / 60;
        double segundos = (double) totalSegundos % 60;

        System.out.printf("Tempo em horas: %.2f%n" + "Tempo em minutos: %.2f%n" + "Tempo em segundos: %.2f", horas, minutos, segundos);
    }
}
