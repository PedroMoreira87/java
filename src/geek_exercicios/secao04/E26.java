package secao04;

public class E26 {
    public static void main(String[] args){
        double km = 250;
        double litros = 25;
        double kmLit = km / litros;

        if (kmLit < 8){
            System.out.println("Venda o carro!");
        }else if(kmLit >= 8 && kmLit <=12){
            System.out.println("Econômico!");
        }else
            System.out.println("Super econômico!");
    }
}
