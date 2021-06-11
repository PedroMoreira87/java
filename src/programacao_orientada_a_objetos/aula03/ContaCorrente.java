package aula03;

public class ContaCorrente {
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	public ContaCorrente(int numero) {
		this.numero = numero;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo = saldo + valor;
	}
	public void retirar(double valor) {
		this.saldo = saldo - valor;	
		assert this.saldo > 0: "Saldo negativo";
	}
	public double verificar() {
		return this.saldo;
	}
	
	public void imprimir() {
		System.out.println("Dados da conta corrente");		
		System.out.println("Nome Cliente: " + this.cliente.getNome());
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Saldo da Conta: " + this.saldo);
		System.out.println("============================================");
	}
}