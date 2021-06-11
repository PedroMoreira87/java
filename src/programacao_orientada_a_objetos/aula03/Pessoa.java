package programacao_orientada_a_objetos.aula03;

import javax.swing.JOptionPane;

public class Pessoa {
	//Atributos
	private String nome;
	private String sobrenome;
	
	//Metodos
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setSobrenome(String novoSobrenome) {
		this.sobrenome = novoSobrenome;
	}
	public String getNome() {
		return this.nome;
	}
	public String getSobrenome() {
		return this.sobrenome;
	}
	public void imprimePessoa() {
		JOptionPane.showMessageDialog(null,  "Pessoa:  " + this.getNome() + " " + this.getSobrenome());
	}
}
