package programacao_orientada_a_objetos.aula13;

public class ContaCorrente {
    private int numero;
    private String senha;
    private double saldo;

    ContaCorrente(int numero, String senha, double saldo){

        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;

    }

    public String toString(){

        String retorno = "";
        return retorno.format("Conta Corrente [numero=%d, senha=%s, saldo=%.2f]", this.numero, this.senha, this.saldo);

    }

    void retirar(int numero, String senha, double valor, int horas) throws ExcecaoSaldoInsuficiente, ExcecaoSenhaInvalida, ExcecaoContaInvalida, ExcecaoHorarioInvalido
    {

        if (this.numero != numero){
            throw new ExcecaoContaInvalida ("Conta inválida");
        }

        if (this.senha != senha){
            throw new ExcecaoSenhaInvalida ("Senha inválida");
        }

        if (horas < 8 || horas > 22){
            throw new ExcecaoHorarioInvalido ("Horário inválido");
        }

        if (saldo < valor){
            throw new ExcecaoSaldoInsuficiente ("Saldo insuficiente");
        }

        this.saldo -= valor;

    }

}
