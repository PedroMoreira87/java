package secao05;

public class E34 {

    public static void main (String[] args)
    {
        System.out.print("Count = ");
        System.out.println(countMultiples(25));
    }

    static int countMultiples(int n)
    {
        int res = 0;
        for (int i = 1; i <= n; i++)
            if (i % 3 == 0 || i % 7 == 0)
                res++;

        return res;
    }
}
