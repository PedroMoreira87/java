package programacao_orientada_a_objetos.aula01;

public class Semaforo {
	
	// ATRIBUTO COR, REPRESENTADA POR UM INTEIRO, VALOR INICIAL IGUAL A 2 (VERMELHO):
	static int cor = 2;
	
	// METODO QUE MUDA PARA A PROXIMA COR:
	static void mudaProximaCor() {
		int i;
		for (i = 0; i < 10; i++) {
			switch (cor) {
			case 0:
				cor = 1;
				System.out.println("AMARELO");
				break;		
			case 1:
				cor = 2;
				System.out.println("VERMELHO");
				break;		
			case 2:
				cor = 0;
				System.out.println("VERDE");
				break;		
			default:
				cor = 2;
				System.out.println("COR FORNECIDA INCORRETA, COR PADRÃO VERMELHA");
				break;
			}
		}	
	}
	
	// METODO QUE MUDA PARA A COR FORNECIDA COMO PARAMETRO:
	static void mudaCorFixa(int novaCor) {
		cor = novaCor;
		System.out.println("NOVA COR FIXADA");
	}
	
	// METODO QUE RETORNA A COR:
	static int mostraCor() {
 		switch (cor) {
 		case 0:
 			System.out.println("COR ATUAL VERDE");
 			break;			
		case 1:
			System.out.println("COR ATUAL AMARELO");
			break;			
		case 2:
			System.out.println("COR ATUAL VERMELHA");
			break;			
		default:
			System.out.println("COR FORNECIDA INCORRETA, COR PADR�O VERMELHA");
			break;
 		}
 		return cor;
	}
}