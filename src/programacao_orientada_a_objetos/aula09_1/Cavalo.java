package aula09_1;

public class Cavalo extends Mamifero {

	public Cavalo() {
		nome = "Cavalo";
	}
		
	public void soar() {
		relinchar();
	}
		
	public void relinchar() {
		System.out.println("Faz relinchos.");
	}
}
