package resolucao_de_problemas_estruturados_em_computacao.orientacao_a_objetos_avancada01;

import java.util.Scanner;

public class Data {

    private String dia, mes, ano, formato;
    private StringBuilder sb = new StringBuilder();
    private StringBuilder sb1 = new StringBuilder();
    private StringBuilder sb2 = new StringBuilder();

    public Data() {
    }

    public void DiaAtual() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o dia atual: ");
        dia = scan.nextLine();

        if (Integer.parseInt(dia) < 1 || Integer.parseInt(dia) > 30) {
            System.out.println("Digite um valor entre 1 e 30");
            DiaAtual();
        }
        if (Integer.parseInt(dia) > 0 && Integer.parseInt(dia) < 10 && !dia.contains("0")) { // porque não funciona se for um int sendo transformado para string???
            System.out.println("Digite o valor do dia com um 0 na frente");
            DiaAtual();
        }
    }

    public void MesAtual() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o mês atual: ");
        mes = scan.nextLine();

        if (Integer.parseInt(dia) < 1 && Integer.parseInt(mes) > 12) {
            System.out.println("Digite um valor entre 1 e 12");
            MesAtual();
        }
        if (Integer.parseInt(mes) > 0 && Integer.parseInt(mes) < 10 && !mes.contains("0")) {
            System.out.println("Digite o valor do mes com um 0 na frente");
            MesAtual();
        }
    }

    public void AnoAtual() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o ano atual completo: ");
        ano = scan.nextLine();
        if (Integer.parseInt(ano) < 1000){
            System.out.println("Digite o ano com 4 digitos");
            AnoAtual();
        }
    }

    public void DefinirFormato() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a opção desejada para o formato da data: \n" +
                "1 - dd/mm/aaaa\n" +
                "2 - dddd/m/aaaa\n" +
                "3 - d:m:aa\n" +
                "4 - aaa/m/d\n" +
                "5 - Sair");

        boolean opcao = false;
        while (!opcao){
            switch (scan.nextInt()) {
                case 1:
                    formato = "dd/MM/yyyy";
                    opcao = true;
                    break;
                case 2:
                    formato = "dddd/M/yyyy";
                    opcao = true;
                    break;
                case 3:
                    formato = "d:M:yy";
                    opcao = true;
                    break;
                case 4:
                    formato = "yyy/M/d";
                    opcao = true;
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Digite a opção correta");
            }
        }
    }

    public void Imprimir() {
            if (formato.equals("dd/MM/yyyy")) {
                System.out.println(dia+"/"+mes+"/"+ano);
            }
            if (formato.equals("dddd/M/yyyy")){
                sb.append(mes);
                sb.deleteCharAt(0);
                mes = sb.toString();
                System.out.println("00"+dia+"/"+mes+"/"+ano);
            }
            if (formato.equals("d:M:yy")) {
                sb.append(dia);
                sb.deleteCharAt(0);
                dia = sb.toString();
                sb1.append(mes);
                sb1.deleteCharAt(0);
                mes = sb1.toString();
                sb2.append(ano);
                sb2.deleteCharAt(0);
                sb2.deleteCharAt(1);
                ano = sb2.toString();
                System.out.println(dia+":"+mes+":"+ano);
            }
            if (formato.equals("yyy/M/d")) {
                sb.append(ano);
                sb.deleteCharAt(0);
                ano = sb.toString();
                sb1.append(mes);
                sb1.deleteCharAt(0);
                mes = sb1.toString();
                sb2.append(dia);
                sb2.deleteCharAt(0);
                dia = sb2.toString();
                System.out.println(ano+"/"+mes+"/"+dia);
            }
    }
}
//    public void Imprimir() {
//        String pattern = formato;
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//        String date = simpleDateFormat.format(new Date());
//        if (formato.equals("yyy/M/d")) {
//            StringBuilder sb = new StringBuilder();
//            sb.append(date);
//            sb.deleteCharAt(0);
//            date = sb.toString();
//        }
//        System.out.println(date);
//    }
