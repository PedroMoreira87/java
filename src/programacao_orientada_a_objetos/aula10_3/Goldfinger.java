package programacao_orientada_a_objetos.aula10_3;

public class Goldfinger extends Terrorista implements Personificacao {
	private Heroi heroi;
	
	public void saltar(float z) {
		super.posicaoZ = z;
		System.out.println("Goldfinger saltando para a posicao " + z + "z");
	}

	@Override
	public void camuflar(int cor) {	
		super.cor = cor;
	}

	@Override
	public void personificar(Heroi h) {
		this.heroi = h;
		System.out.println("Goldfinger personificando " + heroi.getClass().getName() + "...");
	}
}
