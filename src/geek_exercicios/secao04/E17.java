package secao04;

public class E17 {
    static public void main(String[] args){
        double baseMaior = 20;
        double baseMenor = 18;
        double altura = 10;
        double a = ((baseMaior + baseMenor)*altura) / 2;

        if(baseMaior <= 0){
            System.out.println("Base maior deve possuir valor maior que 0");
        }else if(baseMenor <= 0){
            System.out.println("Base menor deve possuir valor maior que 0");
        }else
            System.out.println(a);
    }
}
