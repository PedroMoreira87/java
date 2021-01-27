package trabalho07;

public class Batman extends Heroi implements Camuflagem {
	public void atirar() {
		System.out.println("Morcego atirando");
	}

	@Override
	public void camuflar(int cor) {
		super.cor = cor;
		System.out.println("Morcego camuflando na cor " + cor);
	}
}
