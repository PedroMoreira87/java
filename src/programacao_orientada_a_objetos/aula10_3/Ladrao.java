package programacao_orientada_a_objetos.aula10_3;

public abstract class Ladrao extends Vilao{
	public void saltar(float z) {
		super.posicaoZ = z;
		System.out.println("Ladrao saltando para a posicao " + z + "z");
	}
	
	public void atirar() {
		System.out.println("Ladrao atirando");
	}
}
