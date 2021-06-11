package aula12;

public class Ex03 {

    float save = 0;

    public int fato_recursive(int n) {
        if (n == 0) {
            return 1;
        }else{
            return n * fato_recursive(n - 1); // fórmula
        }
    }

    public float loop(int x){
        for(int i = x - 1 ; i > 0; i--) {
            save += 1.0 / fato_recursive(i);
        }
        return save;
    }

    public static void main(String[] args) {
        Ex03 ex03 = new Ex03();

        System.out.println(ex03.loop(5));

    }
}
