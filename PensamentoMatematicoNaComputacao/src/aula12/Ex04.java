package aula12;

public class Ex04 {

    public int sum_recursive(int a,int b){
        if (a == b) {
            return a;
        }else{
            return a + sum_recursive(a + 1, b);
        }
    }

    public int reverse_recursive(int a, int b){
        if(a < b){
            return sum_recursive(a, b);
        }else{
            return sum_recursive(b, a);
        }
    }

    public static void main(String[] args) {
        Ex04 ex04 = new Ex04();

        System.out.println(ex04.reverse_recursive(4,7));
    }
}
