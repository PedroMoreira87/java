package aula09_1;

public class Cao extends Mamifero {
	
	public Cao() {
		nome = "Cao";
	}
	
	public void soar() {
		latir();
	}
	
	public void latir() {
		System.out.println("Faz Latidos.");
	}
}
