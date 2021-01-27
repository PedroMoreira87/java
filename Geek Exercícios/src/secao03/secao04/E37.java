package secao04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class E37 {

    static String chegadaHora;
    static String partidaHora;

    public static void tempo() throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Didite a hora da chegada: ");
        chegadaHora = scan.nextLine();
        System.out.printf("Hora da chegada: %s\n", chegadaHora);
        System.out.println("==============================");

        System.out.println("Didite a hora da saída: ");
        partidaHora = scan.nextLine();
        System.out.printf("Hora da saída: %s\n", partidaHora);

        DateFormat sdf = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        // d1, d2 are dates
//        String time1 = chegadaHora;
        Date d1 = sdf.parse(chegadaHora);
//        String time2 = partidaHora;
        Date d2 = sdf.parse(partidaHora);
        long diff = d2.getTime() - d1.getTime();

        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000) % 24;
        long diffDays = diff / (24 * 60 * 60 * 1000);

        System.out.print(diffDays + " days, ");
        System.out.print(diffHours + " hours, ");
        System.out.print(diffMinutes + " minutes, ");
        System.out.print(diffSeconds + " seconds.\n");

        if(diffHours <= 2){
            System.out.printf("Você deve pagar: R$%.2f", diffHours * 1.00);
        }else if(diffHours <= 4){
            System.out.printf("Você deve pagar: R$%.2f", diffHours * 1.40);
        }else {
            System.out.printf("Você deve pagar: R$%.2f", diffHours * 2.00);
        }
    }


    public static void main(String[] args) throws ParseException {

        tempo();
    }
}
