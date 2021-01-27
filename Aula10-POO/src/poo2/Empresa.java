package poo2;

public class Empresa {
    public static void main(String[] args) {
        Concursado joao = new Concursado(4000, 5);
        Concursado maria = new Concursado(2400, 3);
        Temporario jose = new Temporario( 2000, 12);
        Temporario pedro = new Temporario( 1200, 10);

        System.out.println("Salario Joao = R$: " + joao.salario_mensal() );
        System.out.println("Salario Jose = R$: " + jose.salario_mensal() );
        System.out.println("Salario Maria = R$: " + maria.salario_mensal() );
        System.out.println("Salario Pedro = R$: " + pedro.salario_mensal() );
    }
}
