package aula10_3;

public abstract class Heroi extends Personagem{
	public void correr(float x, float y) {
		super.posicaoX = x;
		super.posicaoY = y;
		System.out.println("Heroi correndo para as posicoes " + x + "x " + y + "y");
	}
	
	public void saltar(float z) {
		super.posicaoZ = z;
		System.out.println("Heroi saltando para a posicao " + z + "z");
	}
}
