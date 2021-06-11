package aula09_1;

public class Veterinario {
	
	public void examinarAnimal(Animal pet) {
		// late binding -- ligação tardia
		pet.soar();
	}
	
	public void examinarMamifero(Mamifero mani) {
		if (mani instanceof Cao) {
			Cao rex = (Cao)mani;
			// early binding -- ligação precoce
			rex.latir();
		}
		
		else if (mani instanceof Gato) {
			Gato felix = (Gato)mani;
			// early binding -- ligação precoce
			felix.miar();
		}
		
		else if (mani instanceof Cavalo) {
			Cavalo rui = (Cavalo) mani;
			// early binding -- ligação precoce
			rui.relinchar();
		}
		
		else 
			System.out.println("Animal nao encontrado");
	}
	
}
