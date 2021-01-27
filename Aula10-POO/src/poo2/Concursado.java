package poo2;

class Concursado extends Funcionario {
    private int anos_trabalho;
    public Concursado(double salario_base, int anos_trabalho) {
        super(salario_base);
        this.anos_trabalho = anos_trabalho;
    }
    protected double gratificacao() {
        return (anos_trabalho * 100);
    }
}
