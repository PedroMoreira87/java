package aula10_2;

abstract class Funcionario {
    private double salario_base;
    public Funcionario(double salario_base) {
        this.salario_base = salario_base;
    }
    public double salario_mensal() {
        double total = salario_base + gratificacao();
        return total;
    }
    abstract protected double gratificacao();
}
