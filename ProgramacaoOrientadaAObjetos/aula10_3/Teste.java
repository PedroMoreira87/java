package aula10_3;

public class Teste {
	public static void main(String[] args) {
		Batman bat = new Batman();
		Coringa coring = new Coringa();
		Pinguim ping = new Pinguim();
		JamesBond james = new JamesBond();
		DrNo dr = new DrNo();
		Goldfinger gold = new Goldfinger();
		bat.atirar(); // chamada de método do Bataman
		bat.correr(20, 30); // chamada de método herdado
		bat.camuflar(2); // chamada de método do Bataman
		bat.saltar(20); // chamada de método herdado
		System.out.println("----------------------");
		coring.correr(20, 30);
		coring.atirar();
		coring.saltar(5);
		System.out.println("----------------------");
		ping.correr(20, 30);
		ping.atirar();
		ping.saltar(4);
		System.out.println("----------------------");
		james.atirar();
		james.correr(20, 30);
		james.saltar(5);
		System.out.println("----------------------");
		dr.correr(20, 30);
		dr.atirar();
		dr.saltar(3);
		System.out.println("----------------------");
		gold.personificar(james);
		gold.camuflar(1);
		gold.correr(20, 30);
		gold.atirar();
		gold.saltar(2);
	}
}