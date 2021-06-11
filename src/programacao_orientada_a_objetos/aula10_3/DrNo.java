package programacao_orientada_a_objetos.aula10_3;

public class DrNo extends Terrorista {
	public void saltar(float z) {
		super.posicaoZ = z;
		System.out.println("DrNo saltando para a posicao " + z + "z");
	}
	
	public void atirar() {
		System.out.println("DrNo atirando");
	}
	
	public void correr(float x, float y) {
		super.posicaoX = x;
		super.posicaoY = y;
		System.out.println("DrNo correndo para as posicoes" + x + "x " + y + "y");
	}
}