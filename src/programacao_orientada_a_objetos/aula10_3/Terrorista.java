package programacao_orientada_a_objetos.aula10_3;

public abstract class Terrorista extends Vilao{
	public void atirar() {
		System.out.println("Terrorista atirando");
	}
	
	public void saltar(float z) {
		super.posicaoZ = z;
		System.out.println("Terrorista saltando para a posicao " + z + "z");
	}
}
