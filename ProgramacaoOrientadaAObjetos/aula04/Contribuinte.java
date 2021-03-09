package aula04;
import java.util.ArrayList;

public class Contribuinte {
	private String nome;
	private ArrayList<Dependente> dep;

	public Contribuinte(String nome) {
		this.nome = nome;
		dep = new ArrayList<Dependente>();
	}

	public void ligarDependente(Dependente d) {
		dep.add(d);
	}

	public void imprimir() {
		System.out.println("Contribuinte: " + nome);
		imprimirDependentes();
	}

	private void imprimirDependentes() {
		for (Dependente d : dep) { // d é um iterador
			d.imprimir();
		}
	}

	public int numeroDependentes() {
		return dep.size();
	}


}
