package aula01;//LACO DE REPETICAO 10 VEZES MUDANDO A COR DO SEMAFORO E APRESENTADO NO CONSOLE (CHAMA MUDA A PROXIMA COR)
//FIXA A COR DO SEMAFARO EM AMARELO (CHAMA METODO MUDA A COR FIXA)		
//IMPRIMIR A COR DO SEMAFORO (IF E ELSE)

public class Controle {
	public static void main(String[] args) {

		/* IMPRIME A COR DO SEMAFORO: */
		System.out.println("I. IMPRIME A COR DO SEMAFORO:");
		Semaforo.mostraCor();
		System.out.println("");
		
		// IMPRIME 10 VEZES A COR DO SEMAFORO:
		System.out.println("II. MUDA PARA A PRAXIMA COR DO SEMAFORO 10 VEZES:");
		Semaforo.mudaProximaCor();
		System.out.println("");
		
		// FIXA A COR DO SEMAFORO EM AMARELO:
		System.out.println("III. FIXA A COR SO SEMAFORO EM AMARELO:");
		Semaforo.mudaCorFixa(1);
		System.out.println("");
		
		// FIXA A COR DO SEMAFORO EM AMARELO:
		System.out.println("IV. IMPRIME A COR DO SEM�FORO: ");
		Semaforo.mostraCor();
		System.out.println("");
	}
}
