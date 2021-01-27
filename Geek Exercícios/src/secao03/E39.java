package secao03;

public class E39 {

	public static void main(String[] args) {
		int premio = 780000;
		float ganhador1 = premio * 0.46f;
		float ganhador2 = premio * 0.32f;
		float ganhador3 = premio - ganhador2 - ganhador1;
		System.out.println("Primeiro ganhador: " + ganhador1 + "\nSegundo ganhador: " + ganhador2 + "\nTerceiro ganhador: " + ganhador3);
	}

}
