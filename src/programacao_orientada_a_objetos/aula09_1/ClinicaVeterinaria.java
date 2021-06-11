package aula09_1;

import java.util.ArrayList;

// Ctrl + A = Seleciona tudo

// Ctrl + i = Arruma o c�digo

public class ClinicaVeterinaria {

	public static void main(String[] args) {
		Veterinario jose = new Veterinario();
		ArrayList<Animal> rebanho = new ArrayList<Animal>();
		
		Animal ani = new Animal();
		Mamifero mam = new Mamifero();
		
		Cao cao = new Cao();
		Gato gato = new Gato();
		
		rebanho.add(ani);
		rebanho.add(mam);
		rebanho.add(cao);
		rebanho.add(gato);
		rebanho.add(new Cavalo());
		
		for (Animal a : rebanho) {
			// jose.examinarAnimal(ani);
			// mas o correto �:
			jose.examinarAnimal(a);
		}
		
		System.out.println("---------");
		jose.examinarAnimal(ani);
		jose.examinarAnimal(mam);
		jose.examinarAnimal(cao);
		jose.examinarAnimal(gato);
		jose.examinarAnimal(new Cavalo());
		
		System.out.println("---------");
		jose.examinarMamifero(mam);
		jose.examinarMamifero(cao);
		jose.examinarMamifero(gato);
		jose.examinarMamifero(new Cavalo());
		
		for (Animal a : rebanho) {
			if (a instanceof Mamifero) {
				Mamifero mamif = (Mamifero)a;
				jose.examinarMamifero(mamif);
			}
		}
	}
}
