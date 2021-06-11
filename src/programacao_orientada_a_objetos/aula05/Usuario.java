package programacao_orientada_a_objetos.aula05;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

    private String nomeUser;
    private ArrayList <Contato> contatos;
    private String nomeContato;
    private String msg;

    public Usuario(String nomeUser) {
        this.nomeUser = nomeUser;
        this.contatos = new ArrayList<Contato>();
    }

    public void inserirContato(String nomeContato) {
        Scanner leitor = new Scanner(System.in);
        this.nomeContato = nomeContato;
        System.out.println("Informe novo Contato");
        System.out.println();

        nomeContato = leitor.next();
        this.contatos.add(new Contato(nomeContato));
    }

    public void enviarMensagem(String nomeContato, String mensagem) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Contato para enviar msg: ");
        System.out.println();
        this.nomeContato = leitor.nextLine();
        System.out.println();
        System.out.println("Digite msg para [" + this.nomeContato + "]");
        System.out.println();
        this.msg = mensagem;
        this.msg = leitor.nextLine();
        System.out.println();
        Contato contato = this.encontrarContato(this.nomeContato);
        if (contato != null) {
            contato.getMensagens().add(new Mensagem("[ENVIAR]" + this.msg));
            System.out.println("msg enviada com sucesso!!!");
        } else {
            System.out.println("Contato [" + this.nomeContato + "] inexistente");
        }

    }

    public void receberMensagem(String nomeContato, String mensagem) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Contato para Receber msg: ");
        System.out.println();
        this.nomeContato = leitor.nextLine();
        System.out.println();
        System.out.println("Mensagens de:  [" + this.nomeContato + "]");
        System.out.println();
        this.msg = mensagem;
        this.msg = leitor.nextLine();
        System.out.println();
        Contato contato = this.encontrarContato(this.nomeContato);
        if (contato != null) {
            contato.getMensagens().add(new Mensagem("[RECEBER]" + this.msg));
        } else {
            System.out.println("Contato [" + this.nomeContato + "] inexistence");
        }
    }

    public  void imprimirMensagem(String nomeContato) {
        System.out.println("Conversas de: [" + this.nomeUser + "]");
        System.out.println();
        for (Contato c: this.contatos) {
            System.out.println();
            System.out.println("Contato [" + c.getNomeContato() + "] Tem [" + c.getMensagens().size() + "] mensagens");
            System.out.println();
            c.imprimirMensagens();
        }

    }

    public Contato encontrarContato(String nomeContato) {
        for(Contato c : this.contatos) {
            if(c.getNomeContato().equals(this.nomeContato)) {
                return c;
            }
        }
        return null;
    }

    public void conversar() {

        Scanner leitor = new Scanner(System.in);
        boolean fim = false;
        int opt;

        while (! fim) {
            System.out.println();
            System.out.println("--------MENU--------");
            System.out.println("[1] Adicionar Contato");
            System.out.println("[2] Enviar msg para Contato");
            System.out.println("[3] Receber msg de Contato");
            System.out.println("[4] Imprimir Conversa");
            System.out.println("[5] Fim");
            System.out.println();
            System.out.println("Informe Opção Desejada");
            System.out.println("--------------------");
            opt = leitor.nextInt();
            leitor.nextLine();

            switch (opt){
                case 1:
                    inserirContato(nomeContato);
                    break;

                case 2:
                    enviarMensagem(this.nomeContato, this.msg);
                    break;

                case 3:
                    receberMensagem(this.nomeContato, this.msg);
                    break;

                case 4:
                    imprimirMensagem(this.nomeContato);
                    break;

                case 5:
                    fim = true;
                    System.out.println("Fim do Programa...");
                    System.out.println("Até Logo!!!");
                    break;

                default:
                    System.out.println("Opção Inválida, tente novamente!!!");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Usuario joao = new Usuario("João");
        joao.conversar();
    }
}


