package pmc;

public class Ex01 {
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

    public int fibo_recursive(int n){
        int numeroAnteriorAnterior, numeroAnterior = 0, numeroAtual = 1;

        for (int i = 1; i < n ; i++) {

            numeroAnteriorAnterior = numeroAnterior;

            numeroAnterior = numeroAtual;

            numeroAtual = numeroAnteriorAnterior + numeroAnterior;

        }
        return numeroAtual;
    }

    public static void main(String[] args) {
        Ex01 ex01 = new Ex01();

        System.out.println(ex01.fibo_recursive(6));
    }
}
