package secao04;

public class E14 {
    public static void main(String[] args){
        double trabLab = 0;
        double avSeme = 2;
        double examFinal = 6;
        int trabLabPeso = 2;
        int avSemePeso = 3;
        int examFinalPeso = 5;

        double mediaPonderada = ((trabLab*trabLabPeso) + (avSeme*avSemePeso) + (examFinal*examFinalPeso)) / (trabLabPeso + avSemePeso + examFinalPeso);

        System.out.println("Sua média foi: " + mediaPonderada);

        if(mediaPonderada <= 2.9){
            System.out.println("Reprovado");
        }else if(3 <= mediaPonderada && mediaPonderada <= 4.9){
            System.out.println("De recuperação");
        }else{
            System.out.println("Aprovado");
        }

    }
}
