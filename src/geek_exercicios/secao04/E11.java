package secao04;

public class E11 {
    public static void main(String[] args){
        int num = 945;
        String string = Integer.toString(num);
        int primeiro = Integer.parseInt(string.substring(0, 1));
        int segundo = Integer.parseInt(string.substring(1, 2));
        int terceiro = Integer.parseInt(string.substring(2, 3));
        System.out.println(primeiro);
        System.out.println(segundo);
        System.out.println(terceiro);

        if (num > 0){
            System.out.printf("A soma é: %d", primeiro + segundo + terceiro);
        }else
            System.out.println("Número inválido");
    }
}
