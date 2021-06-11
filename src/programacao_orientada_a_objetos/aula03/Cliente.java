package aula03;

import java.util.Scanner;

public class Cliente {
	private String nome;
	private ContaCorrente conta_corrente;
	
	
	public Cliente(String nome, int numero) {
		this.nome = nome;
		this.conta_corrente = new ContaCorrente(numero);
		this.conta_corrente.setCliente(this);
		this.conta_corrente.setSaldo(0);
	}
	
	public void operar() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Cliente " + this.nome);
		System.out.println("Entre o valor do deposito: ");
		double valor = ler.nextDouble();
		
		this.conta_corrente.depositar(valor);
		
		System.out.println("Entre o valor de saque: ");
		valor = ler.nextDouble();
		
		this.conta_corrente.retirar(valor);
		this.conta_corrente.imprimir();
	}
	
	public String getNome() {
		return nome;
	}
}