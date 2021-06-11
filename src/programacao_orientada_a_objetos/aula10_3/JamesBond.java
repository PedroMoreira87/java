package programacao_orientada_a_objetos.aula10_3;

public class JamesBond extends Heroi {
	public void saltar(float z) {
		super.posicaoZ = z;
		System.out.println("James Bond saltando para a posicao " + z + "z");
	}

	@Override
	public void atirar() {
		System.out.println("James Bond atirando - PEW PEW");
	}
}