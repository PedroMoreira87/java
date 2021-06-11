package programacao_orientada_a_objetos.aula10_2;

class Temporario extends Funcionario {
    private int meses_contrato;
    public Temporario(double salario_base, int meses_contrato) {
        super(salario_base);
        this.meses_contrato = meses_contrato;
    }
    public double gratificacao() {
        return (meses_contrato * 10);
    }
}
