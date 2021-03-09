package aula09;

import java.util.Scanner;

public class Problemas {

    public void motor() {
        System.out.println("\nO motor liga?");
        int resposta = getOpc();

        if(resposta == 1) {
            System.out.println("\nO motor está falhando?");

            resposta = getOpc();
            if(resposta == 1) {
                System.out.println("\nGasolina adulterada");
                System.out.println("Problemas relacionados a injecao ou ignicao\n");
            } else {
                System.out.println("\nEntao nao tem problema fio...\n");
            }

        } else {
            System.out.println("\nO motor faz barulho ao virar a chave?");

            resposta = getOpc();
            if (resposta == 1) {
                System.out.println("\nAbasteceu em posto diferente do de costume?");
                resposta = getOpc();

                if(resposta == 1) {
                    System.out.println("\nGasolina adulterada.\n");
                } else {
                    System.out.println("\nProblemas gerais:");
                    System.out.println("- Correia dentada");
                    System.out.println("- Velas, cabos ou bobinas.\n");
                }

            } else {
                System.out.println("\nAs luzes do painel do veiculo acendem?");
                resposta = getOpc();

                if(resposta == 1) {
                    System.out.println("\nAo girar a chave elas apagam?");
                    resposta = getOpc();

                    if (resposta == 1) {
                        System.out.println("\nAlimentacao eletrica:");
                        System.out.println("-Bateria e afins.\n");
                    } else {
                        System.out.println("\nMotor de arranque ou Comutador de ignicao\n");
                    }

                } else {
                    System.out.println("\n-Alimentacao eletrica:");
                    System.out.println("-Bateria e afins.\n");
                }
            }
        }

    }

    public void freio() {
        System.out.println("\nO freio está fazendo barulho?");
        int resposta = getOpc();

        if(resposta == 1) {
            System.out.println("\nPode ser:");
            System.out.println("- Problema nas pastilhas de freio");
            System.out.println("- Problema dos discos de freio");
            System.out.println("- Problema nas lonas de freio");
            System.out.println("- Problema nos tambores de freio\n");
        } else {
            System.out.println("\nProblemas na frenagem?");

            resposta = getOpc();
            if(resposta == 1) {
                System.out.println("\nPode ser:");
                System.out.println("- Vazamento do fluido de freio");
                System.out.println("- Problema nos cilindros");
                System.out.println("- Desgaste excessivo de algum componente do freio.\n");
            } else {
                System.out.println("\nEntao nao tem problema fio...\n");
            }
        }
    }

    public void direcao() {
        System.out.println("\nVoce esta com o volante torto?");

        int resposta = getOpc();
        if(resposta == 1) {
            System.out.println("\nO seu veiculo necessita de uma revisao na suspensao e alinhamento.\n");
        } else {
            System.out.println("\nO volante esta tremendo em velocidades elevadas?");

            resposta = getOpc();
            if(resposta == 1){
                System.out.println("\nO seu veiculo necessita de uma revisao na suspensao e balanceamento.\n");
            } else {
                System.out.println("\nO volante esta com folga ao virar?");

                resposta = getOpc();
                if(resposta == 1) {
                    System.out.println("\nVoce necessita de uma avaliacao da suspensao");
                    System.out.println("Provavelmente o problema e na caixa de direcao e afins\n");
                } else {
                    System.out.println("\nEntao nao tem problema fio...\n");
                }
            }
        }
    }

    public int getOpc() {
        Scanner in = new Scanner(System.in);
        int num = 0;
        try{
            System.out.println("1- Sim, 2- Nao.");
            num = in.nextInt();

            if (num != 1 && num != 2) {
                System.out.println("\nOpcao invalida.");
                getOpc();
            }
        } catch (Exception e) {
            System.out.println("Digite uma opcao valida\n");
            getOpc();
        }
        return num;
    }
}
