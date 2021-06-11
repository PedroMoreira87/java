package aula10_3;

public class Pinguim extends Ladrao{
	public void atirar() {
		System.out.println("Pinguim atirando");
	}
	
	public void correr(float x, float y) {
		super.posicaoX = x;
		super.posicaoY = y;
		System.out.println("Pinguim correndo para a posicao " + x + "x " + y + "y");
	}
}
