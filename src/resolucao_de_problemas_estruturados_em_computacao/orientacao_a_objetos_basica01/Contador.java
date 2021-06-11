package resolucao_de_problemas_estruturados_em_computacao.orientacao_a_objetos_basica01;

public class Contador {

    private int contador = 0;

    public void zerar(){
        this.contador = 0;
    }

    public void incrementar(){
        this.contador++;
    }

    public void imprimir(){
        System.out.println(this.contador);
    }
}
