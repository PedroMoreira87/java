package secao09.bonus01;

// tipo cc conta corrente cp conta poupança
// abrirConta if aberta verdadiro if fechada falso
// na hora que abro tenho que dizer se é conta corrente ou poupança
// se for cc + 50 ou cp + 150
// fecharConta naom pode ter dinheiro , tenho que sacar e n posso ser devedor
// depositar tem que estar com o status verdadeiro e para sacar status verdadeiro tbm e saldo para sacar até o valor que tenho
// pagarMensalidade na hora que for chamado a mensalidade tem que ser cobrada do saldo cc 12 e cp 20
// sempre que a conta for criado o seu status vai ser falso e saldo 0

import java.util.Scanner;

public class ContaBanco implements Controlador{
    public int numConta;
    protected String tipo;
    private String nome;
    private double saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String nome, double saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.nome = nome;
        this.saldo = saldo;
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Que tipo de conta deseja abrir?\n" +
                "1 - Conta Corrente\n" +
                "2 - Conta Poupança");
        if (scan.nextInt() == 1){
            setStatus(true);
            setTipo("cc");
            setSaldo(getSaldo() + 50);
            System.out.println("Conta Corrente criada com sucesso\n" +
                    "Seu saldo é: R$" + getSaldo());
        }else{
            setStatus(true);
            setTipo("cp");
            setSaldo(getSaldo() + 150);
            System.out.println("Conta Poupança criada com sucesso\n" +
                    "Seu saldo é: R$" + getSaldo());
        }
    }

    public void fecharConta(){
        if (getSaldo() > 0){
            System.out.println("Você deve sacar o saldo antes de fechar a conta");
            sacar();
            fecharConta();
        }else if (getSaldo() < 0){
            System.out.println("Você deve quitar seus débitos antes de fechar a conta");
            depositar();
        }else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(){
        // isStatus() 0vai ser sempre true // !isStatus() = false
        if (isStatus()){
            Scanner scan = new Scanner(System.in);
            System.out.println("Qual o valor que deseja depositar? ");
            double valorDeposito = scan.nextDouble();
            setSaldo(getSaldo() + valorDeposito);
            System.out.println("Dinheiro depositado com sucesso\n" +
                    "Seu saldo atualizado é: R$" + getSaldo());
        }else{
            System.out.println("Sua conta se encontra desativada, favor entrar em contato com o gerente do banco");
        }

    }

    public void sacar(){
        System.out.println("Seu saldo é: R$" + getSaldo());
        if (isStatus() && getSaldo() > 0){
            Scanner scan = new Scanner(System.in);
            System.out.println("Qual o valor que deseja sacar? ");
            double valorSaque = scan.nextDouble();
            if(valorSaque <= getSaldo()){
                setSaldo(getSaldo() - valorSaque);
                System.out.println("Dinheiro sacado com sucesso\n" +
                        "Seu saldo atualizado é: R$" + getSaldo());
            }else{
                System.out.println("Saldo insuficiente para saque\n" +
                        "Favor digitar um valor menor ou igual a: R$" + getSaldo());
                sacar();
            }
        }else{
            System.out.println("Saldo insuficiente para saque");
        }
    }

    public void pagarMensal(){
        if(getTipo().equals("cc")){
            if(isStatus()){
                if(getSaldo() > 0){
                    setSaldo(getSaldo() - 12);
                }else{
                    System.out.println("Saldo insuficiente");
                }
            }else{
                System.out.println("Sua conta se encontra desativada, favor entrar em contato com o gerente do banco");
            }
        }else if(getTipo().equals("cp")){
            if(isStatus()){
                if(getSaldo() > 0){
                    setSaldo(getSaldo() - 20);
                }else{
                    System.out.println("Saldo insuficiente");
                }
            }else{
                System.out.println("Sua conta se encontra desativada, favor entrar em contato com o gerente do banco");
            }
        }else{
            System.out.println("ERRO");
        }
    }

    public void imprimirContaBanco(){
        System.out.println("==============================\n" +
                "Conta: " + getNumConta() + "\n" +
                "Tipo: " + getTipo() + "\n" +
                "Dono: " + getNome() + "\n" +
                "Saldo: " + getSaldo() + "\n" +
                "Status: " + isStatus());
    }
}
