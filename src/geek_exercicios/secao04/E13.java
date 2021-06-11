package secao04;

public class E13 {
    static public void main(String[] args){
        double nota1 = 6;
        double nota2 = 4;
        double nota3 = 8;
        int nota1Peso = 1;
        int nota2Peso = 1;
        int nota3Peso = 2;

        double mediaPonderada = ((nota1*nota1Peso) + (nota2*nota2Peso) + (nota3*nota3Peso)) / (nota1Peso + nota2Peso + nota3Peso)*10;

        System.out.println("Sua média ponderada foi: " + mediaPonderada);

        if (mediaPonderada >= 60){
            System.out.println("Parabéns você foi aprovado");
        }else{
            System.out.println("Infelizmente você não foi aprovado");
        }
    }
}
