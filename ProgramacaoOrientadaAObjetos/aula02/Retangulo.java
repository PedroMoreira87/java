package aula02;

public class Retangulo {

	private static float ladoH;

	private static float ladoV;

	public static void definir_lados(float ladoh, float ladov) {
		assert(ladoh > 0 && ladov > 0): "Erro, lado(s) não pode(m) ser negativo(s)";
		ladoH = ladoh;
		ladoV = ladov;
	}

	public static float area() {
		return ladoH * ladoV;
	}

	public static float perimetro() {
		return 2*(ladoH + ladoV);
	}
}
