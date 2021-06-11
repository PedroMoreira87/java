package programacao_orientada_a_objetos.aula09_1;

public class Veterinario {
	
	public void examinarAnimal(Animal pet) {
		// late binding -- liga��o tardia
		pet.soar();
	}
	
	public void examinarMamifero(Mamifero mani) {
		if (mani instanceof Cao) {
			Cao rex = (Cao)mani;
			// early binding -- liga��o precoce
			rex.latir();
		}
		
		else if (mani instanceof Gato) {
			Gato felix = (Gato)mani;
			// early binding -- liga��o precoce
			felix.miar();
		}
		
		else if (mani instanceof Cavalo) {
			Cavalo rui = (Cavalo) mani;
			// early binding -- liga��o precoce
			rui.relinchar();
		}
		
		else 
			System.out.println("Animal nao encontrado");
	}
	
}
