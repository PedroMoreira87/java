package geek_exercicios.secao03;

public class E46 {

	public static void main(String[] args) {
		String original = "123";
		StringBuilder reverse = new StringBuilder();
		
		int length = original.length();

	    for (int i = length - 1; i >= 0; i--)
	    	reverse.append(original.charAt(i));
	    		
	    System.out.println("Reverse of the string: " + reverse);
	}

}
