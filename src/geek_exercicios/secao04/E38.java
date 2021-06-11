package secao04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class E38 {
    final static String DATE_FORMAT = "dd-MM-yyyy";

    public static String isDateValid(String date){
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return "Data válida";
        } catch (ParseException e) {
            return "Data inválida";
        }
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a sua data de nascimento? ");
        String data = scan.nextLine();

        System.out.println(isDateValid(data));
    }
}
