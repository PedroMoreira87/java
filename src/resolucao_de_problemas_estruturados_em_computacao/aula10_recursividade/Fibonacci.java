package resolucao_de_problemas_estruturados_em_computacao.aula10_recursividade;

public class Fibonacci {

    public int fibonacci (int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
