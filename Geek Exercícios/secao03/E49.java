package secao03;

public class E49 {
    public static void main(String[] args){
        int hora = 14;
        int minuto = 30;
        int segundo = 40;
        int duracao = 7280;

        double duracaoH = (double) duracao / 3600; // transformação do tempo
        double duracaoM = (double) (duracao % 3600) / 60;
        double duracaoS = duracao % 60;

        int terminoH = (int ) (hora + duracaoH);
        int terminoM = (int ) (minuto + duracaoM);
        int terminoS = (int ) (segundo + duracaoS);

        if (terminoH >= 24) {
            terminoH = terminoH - 24;
        }if (terminoM >= 60) {
            terminoH ++;
            terminoM = terminoM - 60;
        }if (terminoS >= 60) {
            terminoM ++;
            terminoS = terminoS - 60;
        }

        System.out.printf("Início em: %d:%d:%d%n", hora, minuto, segundo);
        System.out.println("============================================================");
        System.out.printf("Duração em horas: %.2f%n" + "Duração em minutos: %.2f%n" + "Duração em segundos: %.2f%n", duracaoH, duracaoM, duracaoS);
        System.out.println("============================================================");
        System.out.printf("Término em: %d:%d:%d", terminoH, terminoM, terminoS);
    }
}
