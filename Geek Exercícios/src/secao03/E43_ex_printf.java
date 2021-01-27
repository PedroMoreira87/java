package secao03;

public class E43_ex_printf {

	public static void main(String[] args) {

		float valorTotal = 500;
		float total10 = valorTotal * 0.90f;
		float parcela3 = valorTotal / 3;
		float comissaoaVista = total10 * 0.05f;
		float comissaoParcelada = valorTotal * 0.05f;
		
		System.out.printf("Total a pagar com desconto: R$%.2f\n" + "Valor da parcela em 3x sem juros: R$%.2f\n" + "Comissão vendedor, venda a vista: R$%.2f\n" + "Comissão vendedor, venda parcelada: R$%.2f", total10, parcela3, comissaoaVista, comissaoParcelada);
	}

}