package secao05;

public class E30 {

    public static void main(String[] Args) {

        int n = 1;
        int x = 0;
        int i;

        while (n<10){
            if (n %2 !=0){
                for (i = 3; i * i <=n; i+=2){
                    if (n%i ==0)
                        break;
                }
                if (i < n){
                    x ++;
                }
            }
            n ++;
        }
        System.out.println(x);

    }
}