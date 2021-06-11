package resolucao_de_problemas_estruturados_em_computacao.aula05_pilha;

public class Expressao {

    private char[] abre = {'(', '{', '['};
    private char[] fecha = {')', '}', ']'};

    public boolean isValido(String expressao) throws Exception {
        Pilha p = new Pilha(expressao.length());
        for (int i = 0; i < expressao.length(); i++){
            for (int j = 0; j < 3; j++){
                if (expressao.charAt(i) == abre[j]){
                    p.empilhar(abre[j]);
                }if(expressao.charAt(i) == fecha[j]){
                    if (p.topoValor() == abre[j]){
                        p.desempilhar();
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
