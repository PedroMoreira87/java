package aula10_trabalho;

/*Program coded by The Alchemist
 * This is a MD5 bruteforce script
 * DEQUE HELPED ME WITH THE BRUTEFORCING CODE
 * Works upto words that are as long as the user desires it to be
 * Supports numbers,characters(both uppercase and lowercase)
 * and special characters normally used in passwords
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.*;
public class ForcaBruta
{
    static String answer="";
    static String lista;

    public void search(){
        long e0 = System.currentTimeMillis();
        char[] ar ={ 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3',
                '4', '5', '6', '7', '8', '9','`','~','!','@','#','$','%','^','&','*','(',')','-','_','=','+',
                '|','{','}','[',']',';',':',',','<','.','>','/','?'};
        try {
            FileReader arq = new FileReader("seguranca_da_informacao/Hash.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();

            while (linha != null) {
                String[] linhaSplit = linha.split(":");
                String senha = linhaSplit[1];
                linha = lerArq.readLine();
                final int MAX_WORDLENGTH = 20;//YOU JUST NEED TO CHANGE THIS TO MODIFY THE MAXIMUM WORDLENGTH
                for(int wordlength = 1; wordlength <= MAX_WORDLENGTH; wordlength++)
                {
                    if(generate(wordlength,ar,senha))
                    {
                        System.out.println("Match found!! The decrypted string is : "+ answer);
                        break;
                    }
                    else
                    {
                        System.out.println("Not a word of "+wordlength+" characters");
                    }
                }
            }
            arq.close();
            System.out.println("Usuário ou Senha inválidos");
        }
        catch(IOException e){
            System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        long e1 = System.currentTimeMillis();
        System.out.println((e1 - e0)/1000 + "s");
    }
    private boolean generate(int wordlength, char[] alphabet,String enc)
    {
        final long MAX_WORDS = (long) Math.pow(alphabet.length, wordlength);
        final int RADIX = alphabet.length;
        for (long i = 0; i < MAX_WORDS; i++)
        {
            int[] indices = convertToRadix(RADIX, i, wordlength);
            char[] word = new char[wordlength];
            for (int k = 0; k < wordlength; k++)
            {
                word[k] = alphabet[indices[k]];
            }
            String ss=new String(word);
            if(compareit(encrypt(ss),enc))
            {
                answer=ss;
                return true;
            }
        }
        return false;
    }
    private int[] convertToRadix(int radix, long number, int wordlength)
    {
        int[] indices = new int[wordlength];
        for (int i = wordlength - 1; i >= 0; i--)
        {
            if (number > 0)
            {
                int rest = (int) (number % radix);
                number /= radix;
                indices[i] = rest;
            }
            else
            {
                indices[i] = 0;
            }

        }
        return indices;
    }
    public String encrypt(String str){
        MessageDigest m= null;
        try {
            m = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        assert m != null;
        m.update(str.getBytes(),0,str.length());
        String hashbruto = new BigInteger(1,m.digest()).toString(16);
        lista = hashbruto;
        return hashbruto;
    }
    public boolean compareit(String s2, String s1)
    {
        String a=s1;
        if(s1.contains(s2))
            return true;
        else
        {
            /*Java often misses out some zeroes while encrypting text, so here
             * I'm removing zeroes one by one from the original string and then
             * performing the check again*/
            while(a.indexOf('0')!=-1)
            {
                a=a.substring(0,a.indexOf('0'))+a.substring(a.indexOf('0')+1,a.length());
                if(a.contains(s2))
                    return true;
            }
        }
        return false;
    }
}
