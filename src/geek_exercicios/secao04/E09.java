package secao04;

public class E09 {
    public static void main(String[] args){
        double salario = 2200.00;
        double prestEmprestimo = 300.00;
        double prestAnalise = (prestEmprestimo * 100) / salario;

        if (prestAnalise > 20){
            System.out.println("Empréstimo não concedido");
        }else{
            System.out.println("Empréstimo concedido");
        }
    }
}
