package secao04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class E35 {
    final static String DATE_FORMAT = "dd-MM-yyyy";

    public static boolean isDateValid(String date)
    {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println(isDateValid("22-01-1987"));
    }
}
