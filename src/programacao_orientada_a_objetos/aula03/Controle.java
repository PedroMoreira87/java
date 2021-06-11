package aula03;

import javax.swing.JOptionPane;

public class Controle {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(); // invocacao do metodo construtor da classe Pessoa
		Pessoa p2 = new Pessoa(); // invocacao do metodo construtor da classe Pessoa
		
		String n = JOptionPane.showInputDialog(null, "Nome da Pessoa 1: ");
		String sn = JOptionPane.showInputDialog(null, "Sobrenome da Pessoa 1: ");
		
		p1.setNome(n);
		p1.setSobrenome(sn);
		
		n = JOptionPane.showInputDialog(null, "Nome da Pessoa 2: ");
		sn = JOptionPane.showInputDialog(null, "Sobrenome da Pessoa 2: ");
		
		p2.setNome(n);
		p2.setSobrenome(sn);
		
		p1.imprimePessoa();
		p2.imprimePessoa();
	}
}