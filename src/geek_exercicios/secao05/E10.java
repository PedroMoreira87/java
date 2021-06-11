package secao05;

public class E10 {

    public static void main(String[] Args){
        
        int num = 0;

        for (int i = 0; i < 51; i ++){

            if(i % 2 == 0){
                num += i;
            }
        }
        System.out.println(num);
    }
}
