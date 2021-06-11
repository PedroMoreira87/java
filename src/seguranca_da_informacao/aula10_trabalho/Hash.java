package seguranca_da_informacao.aula10_trabalho;

import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Hash {
    ForcaBruta fb = new ForcaBruta();

    /////////////////// menu
    public void menu(){

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("1 - Para cadastrar");
            System.out.println("2 - Para logar");
            System.out.println("3 - Para ataque de Força Bruta");
            System.out.println("4 - Para sair");

            int valor = scan.nextInt();

            switch (valor) {
                case 1:
                    System.out.println("Digite seu usuário: ");
                    String usuarioCad = scan.next();
                    System.out.println("Digite sua senha: ");
                    String senhaCad = scan.next();
                    if (senhaCad.length() < 10){
                        System.out.println("Favor digitar uma senha de no mínimo 10 digitos");
                        menu();
                    }
                    String senhaCripto = md5(senhaCad);
                    gravarArquivo(usuarioCad, senhaCripto, "seguranca_da_informacao/Hash.txt");
                    break;
                case 2:
                    System.out.println("Digite seu usuário: ");
                    String usuarioLog = scan.next();
                    System.out.println("Digite sua senha: ");
                    String senhaLog = scan.next();
                    String senhaCripto1 = md5(senhaLog);
                    lerArquivo(usuarioLog, senhaCripto1, "seguranca_da_informacao/Hash.txt");
                    break;
                case 3:
                    fb.search();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("===============================");
                    System.out.println("Valor incorreto");
                    System.out.println("===============================");
                    menu();
                    break;
            }
        } catch (Exception e) {
            System.out.println("===============================");
            System.out.println("Valor incorreto");
            System.out.println("===============================");
            menu();
        }
    }

    //////////////////// geração do hash da senha
    public String md5(String senha){
        MessageDigest m= null;
        try {
            m = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        assert m != null;
        m.update(senha.getBytes(),0,senha.length());
        return new BigInteger(1,m.digest()).toString(16);
    }

    /////////////////// cadastro do usuário e geração do txt
    public void gravarArquivo(String nome, String senha, String nomeArquivo) {
        try(FileWriter fw = new FileWriter(nomeArquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)){
            out.println(nome + ":" + senha);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    ////////////// validação do login do usuário
    public void lerArquivo(String usuarioLog, String senhaLog, String nomeArquivo) {
        try {
            FileReader arq = new FileReader(nomeArquivo);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();

            while (linha != null) {
                String[] linhaSplit = linha.split(":");
                String nome = linhaSplit[0];
                String senha = linhaSplit[1];
                if (nome.equals(usuarioLog) && senha.equals(senhaLog)) {
                    System.out.println("Bem vindo");
                    return;
                }
                linha = lerArq.readLine();
            }
            arq.close();
            System.out.println("Usuário ou Senha inválidos");
        }
        catch(IOException e){
            System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }
    /////////////////// main
    public static void main(String[] args) {
        Hash hash = new Hash();

        hash.menu();
    }
}
