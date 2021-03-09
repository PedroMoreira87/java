package secao05;

public class E30 {
    public static void main(String[] Args) {

        System.out.println(n1(6));
        System.out.println(n2(6*2-1));
        System.out.println(n3(6*2-1));
    }

    public static int n1 (int n) {
        int num = 0;

        for (int i = 1; i <= n; i++) {
            num += i;
        }
        return num;
    }

    public static int n2 (int n) {
        int num = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 2 || i == 4) {
                num -= i;
            } else {
                num += i;
            }
        }
        return num;
    }

    public static int n3 (int n){
        int num = 0;

        for (int i = 1; i <= n; i+=2){
            num += i;
        }
        return num;
    }
}
