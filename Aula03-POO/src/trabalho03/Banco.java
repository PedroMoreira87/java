package trabalho03;

public class Banco {

	public static void main(String[] args) {
		Cliente jean = new Cliente("Jean da Silva Guedes", 96256);
		Cliente david = new Cliente("David Soares Monteiro", 56326);
		Cliente bruno = new Cliente("Bruno Figueiredo Albuquerque", 02345);
		
	jean.operar();
	david.operar();
	bruno.operar();
		
	}

}