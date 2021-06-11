package programacao_orientada_a_objetos.aula13;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<ContaCorrente> listaDeContas = new ArrayList<>();

    public Banco(String nome){

        this.nome = nome;

    }

    void addConta(ContaCorrente conta){

        listaDeContas.add(conta);

    }

    void operacoes(){
        int cont = 1;
        System.out.println("Operações no banco " + nome);

        for(ContaCorrente conta : listaDeContas){
            System.out.println("----------------------------------");
            System.out.println("Antes da operação:");
            imprimeConta(conta);
            try{
                conta.retirar(cont, "POO", 500, 18+cont);

            } catch (ExcecaoContaInvalida erro) {
                System.out.println(erro.mensagem);
            } catch (ExcecaoSenhaInvalida erro) {
                System.out.println(erro.mensagem);
            } catch (ExcecaoHorarioInvalido erro) {
                System.out.println(erro.mensagem);
            } catch (ExcecaoSaldoInsuficiente erro) {
                System.out.println(erro.mensagem);
            }
            finally{
                System.out.println("\nApós a operação:");
                imprimeConta(conta);
                cont++;
            }

        }

    }

    void imprimeConta(ContaCorrente conta){

        System.out.println(conta.toString());

    }

    public static void main(String[] args) {
        Banco banco = new Banco("Bradesco");
        banco.listaDeContas.add(new ContaCorrente(1, "POO", 500.0));
        banco.listaDeContas.add(new ContaCorrente(340, "POO", 400.0));
        banco.listaDeContas.add(new ContaCorrente(3, "OOP", 300.0));
        banco.listaDeContas.add(new ContaCorrente(4, "POO", 200.0));
        banco.listaDeContas.add(new ContaCorrente(5, "POO", 600.0));

        banco.operacoes();

    }

}
