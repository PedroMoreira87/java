package aula10_3;

public abstract class Vilao extends Personagem{
	public void correr(float x, float y) {
		super.posicaoX = x;
		super.posicaoY = y;
		System.out.println("Vilao correndo para as posicoes " + x + "x " + y + "y");
	}
}
