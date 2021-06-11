package pensamento_matematico_na_computacao.aula05;

public class TabelaVerdade {
	private String[][] matriz = new String[5][8];
	
	public TabelaVerdade() {
		atribuicaoValoresTabela();
		implicacao();
		e();
		ou();
		bicondicional();
	}
	
	public void atribuicaoValoresTabela() {
		matriz[0][0] = "p";
		matriz[0][1] = "q";
		matriz[0][2] = "~p";
		matriz[0][3] = "~q";
		matriz[1][0] = "V";
		matriz[1][1] = "V";
		matriz[1][2] = "F";
		matriz[1][3] = "F";
		matriz[2][0] = "V";
		matriz[2][1] = "F";
		matriz[2][2] = "F";
		matriz[2][3] = "V";
		matriz[3][0] = "F";
		matriz[3][1] = "V";
		matriz[3][2] = "V";
		matriz[3][3] = "F";
		matriz[4][0] = "F";
		matriz[4][1] = "F";
		matriz[4][2] = "V";
		matriz[4][3] = "V";
	}
	
	public void implicacao() {
		matriz[0][4] = "p->q";
		matriz[1][4] = "V";
		matriz[2][4] = "F";
		matriz[3][4] = "V";
		matriz[4][4] = "V";
		}
	
	public void e() {
		matriz[0][5] = "p^q";
		matriz[1][5] = "V";
		matriz[2][5] = "F";
		matriz[3][5] = "F";
		matriz[4][5] = "F";
		}
	
	public void ou() {
		matriz[0][6] = "pvq";
		matriz[1][6] = "V";
		matriz[2][6] = "V";
		matriz[3][6] = "V";
		matriz[4][6] = "F";
		}
	
	public void bicondicional() {
		matriz[0][7] = "p<->q";
		matriz[1][7] = "V";
		matriz[2][7] = "F";
		matriz[3][7] = "F";
		matriz[4][7] = "V";
		}
	public void imprimir(int coluna) {
		for (int i = 0; i < 5; i++) {
			System.out.println(matriz[i][coluna]);
		}
	}
}
