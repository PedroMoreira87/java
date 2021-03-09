package aula09_1;

public class Animal {
	protected String nome;
	
	public Animal () {
		this.nome = "Animal";
	}

	public String getNome() {
		return nome;
	}
	
	public void soar() {
		System.out.println("Som de animal.");
	}
	
}
