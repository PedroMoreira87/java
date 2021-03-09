package aula02;

public class Circulo {
	private static double PI = 3.141516;
	
	public static double area( double r )
	{ return PI * r * r; }
	
	public static double perimetro( double r )
	{ return 2 * PI * r; }
	
	private static double raio;
	
	public static void defina_raio( double r )
	{ raio = r; }
	
	public static double area( )
	{ return PI * raio * raio; }
	
	public static double perimetro( )
	{ return 2 * PI * raio; }
}