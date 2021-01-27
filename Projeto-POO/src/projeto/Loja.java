package projeto;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Loja {


    public String[] leValores(String[] dadosIn) {
        String[] dadosOut = new String[dadosIn.length];

        for (int i = 0; i < dadosIn.length; i++) {
            dadosOut[i] = JOptionPane.showInputDialog ("Entre com " + dadosIn[i] + ": ");
        }

        return dadosOut;
    }


    public ArmaDeFogo leArmaDeFogo() {
        String[] valores = new String[5];
        String[] nomeVal = {"Nome", "Modelo", "Preço", "Calibre", "Capacidade"};
        valores = leValores(nomeVal);

        ArmaDeFogo armaDeFogo = new ArmaDeFogo(valores[0], valores[1], valores[2], valores[3], valores[4]);
        return armaDeFogo;
    }


    public Airsoft leAirsoft() {
        String[] valores = new String[5];
        String[] nomeVal = {"Nome", "Modelo", "Preço", "FPS", "Tipo"};
        valores = leValores(nomeVal);

        Airsoft airsoft = new Airsoft(valores[0], valores[1], valores[2], valores[3], valores[4]);
        return airsoft;
    }


    public ArmaBranca leArmaBranca() {
        String[] valores = new String[5];
        String[] nomeVal = {"Nome", "Modelo", "Preço", "Material", "Lâmina"};
        valores = leValores(nomeVal);

        ArmaBranca armaBranca = new ArmaBranca(valores[0], valores[1], valores[2], valores[3], valores[4]);
        return armaBranca;
    }


    public void mostraArmas(String dados) {
        JOptionPane.showMessageDialog(null, "PRODUTO\n-------\n +" + dados);
    }


    public void salvaArmas(ArrayList<Arma> armas) {
        ObjectOutputStream outputStream = null;
        try{
            outputStream = new ObjectOutputStream(new FileOutputStream("armas.dat"));
            for(Arma arma: armas) {
                outputStream.writeObject(arma);
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Impossivel criar arquivo!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public ArrayList<Arma> recuperaArmas() {
        ArrayList<Arma> armas = new ArrayList<>();
        ObjectInputStream inputStream = null;

        try{
            inputStream = new ObjectInputStream (new FileInputStream("armas.dat"));
            Object obj;

            while((obj = inputStream.readObject()) != null){

                if (obj instanceof Arma) {
                    armas.add((Arma) obj);
                }
            }
        } catch (EOFException e) {
            System.out.println("End of file reached");

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } finally {
            try {
                if(inputStream != null) {
                    inputStream.close();
                    System.out.println("Armas recuperados com sucesso!\n");

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } return armas;
    }


    public void menuArmas() {
        ArrayList<Arma> armas = new ArrayList<>();

        String menu = "";
        String entrada;
        int    opc1, opc2;

        do {
            menu = "Controle Loja\n" +
                    "Opções:\n" +
                    "1. Entrar Armas\n" +
                    "2. Exibir Armas\n" +
                    "3. Limpar Armas\n" +
                    "4. Gravar Armas\n" +
                    "5. Recuperar Armas\n" +
                    "9. Sair";

            entrada = JOptionPane.showInputDialog (menu + "\n\n");

            while (!numeroInteiroValido(entrada)) {
                entrada = JOptionPane.showInputDialog(null, menu +
                        "\n\nEntrada inválida! Digite um número inteiro.");
            }

            opc1 = new Integer(entrada);

            switch (opc1) {
                case 1:
                    menu = "Entrada de Arma\n" +
                            "Opções:\n" +
                            "1. Arma de Fogo\n" +
                            "2. Arma Branca\n" +
                            "3. Airsoft\n";

                    entrada = JOptionPane.showInputDialog (menu + "\n\n");

                    while (!numeroInteiroValido(entrada)) {
                        entrada = JOptionPane.showInputDialog(null, menu +
                                "\n\nEntrada inválida! Digite um número inteiro.");
                    }
                    opc2 = new Integer(entrada);

                    switch (opc2){
                        case 1: armas.add((Arma)leArmaDeFogo());
                            break;

                        case 2: armas.add((Arma)leArmaBranca());
                            break;

                        case 3: armas.add((Arma)leAirsoft());
                            break;

                        default:
                            JOptionPane.showMessageDialog(null,"Arma para entrada NÃO escolhido!");
                    }
                    break;

                case 2:
                    if (armas.size() == 0) {
                        JOptionPane.showMessageDialog(null,"Entre com armas primeiramente");
                        break;
                    }
                    String dados = "";
                    for (int i=0; i < armas.size(); i++)	{
                        dados += armas.get(i).toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null,dados);
                    break;

                case 3:
                    if (armas.size() == 0) {
                        JOptionPane.showMessageDialog(null,"Entre com armas primeiramente");
                        break;
                    }
                    armas.clear();
                    JOptionPane.showMessageDialog(null,"Dados LIMPOS com sucesso!");
                    break;

                case 4:
                    if (armas.size() == 0) {
                        JOptionPane.showMessageDialog(null,"Entre com armas primeiramente");
                        break;
                    }
                    salvaArmas(armas);
                    JOptionPane.showMessageDialog(null,"Dados SALVOS com sucesso!");
                    break;

                case 5:
                    armas = recuperaArmas();
                    if (armas.size() == 0) {
                        JOptionPane.showMessageDialog(null,"Sem dados para apresentar.");
                        break;
                    }
                    JOptionPane.showMessageDialog(null,"Dados RECUPERADOS com sucesso!");
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null,"Fim do aplicativo LOJA DE ARMAMENTO BÉLICO ");
                    break;

            }
        } while (opc1 != 9);
    }


    private boolean numeroInteiroValido(String s) {
        boolean resultado;
        try {
            Integer.parseInt(s);
            resultado = true;

        } catch (NumberFormatException e) {
            resultado = false;

        }
        return resultado;
    }


    public static void main(String[] args) {

        Loja sp = new Loja ();

        sp.menuArmas();

    }
}
