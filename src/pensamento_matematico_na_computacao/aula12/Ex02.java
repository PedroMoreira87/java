package pensamento_matematico_na_computacao.aula12;

public class Ex02 {
    // 1, 1, 2, 3, 5, 8, ...
    //n(1)=1
    //n(2)=1
    //n(3)=2 fibo (3-1) + fibo(3-2)
    //n(4)=3
    //n(5)=5
    //n(6)=8

    //retorna int
    //sempre tem parametro int
    //sempre tem no mínimo um IF e um ELSE
    //else: chama a propria função
    int result = 0;
    public int fibo(int n){
        if (n < 2){
            return 1;
        }else{
            return fibo(n-1) + fibo(n-2);
        }
    }

    public void loop(int n){
        for (int i = 1; i <= n; i++) {
            result = fibo(i);
            System.out.println(i + " > " + result);
        }
    }

    // como a variavel está em inteiro o programa não conseguiu comportar o valor no 47 número.
    // o tipo de dado primitivo inteiro comporta até 2,147,483,647.
    public static void main(String[] args) {
        Ex02 ex02 = new Ex02();

        ex02.loop(6);
    }
}
