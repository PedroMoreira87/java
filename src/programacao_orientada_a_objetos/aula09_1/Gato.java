package programacao_orientada_a_objetos.aula09_1;

public class Gato extends Mamifero {

	public Gato() {
		nome = "Gato";
	}
	
	public void soar() {
		miar();
	}
	
	public void miar() {
		System.out.println("Faz miados.");
	}
}
