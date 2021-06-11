package resolucao_de_problemas_estruturados_em_computacao.aula05_pilha;

import java.util.Arrays;

public class Pilha {
    // índice do elemento no topo da pilha
    private int topo = -1;
    // armazenamento de dados
    private int[] dados;
    // quantidade máxima do array
    private int capacidade;

    public int getTopo() {
        return topo;
    }

    public Pilha(int tamanho) {
        this.dados = new int[tamanho];
        this.capacidade = tamanho;
    }

    public int topoValor(){
        if (!isVazia()) {
            return dados[topo];
        }else {
            return 0;
        }
    }

    public boolean isVazia(){
        return topo == -1;
    }

    public boolean isCheia(){
        return topo == dados.length - 1;
    }

    public void empilhar(int valor) {
        if (isCheia()){
        }else{
            dados [++topo] = valor;
        }
    }

    public int desempilhar() throws Exception{
        if (isVazia()){
            throw new Exception("A pilha está vazia");
        }else{
            dados[topo] = 0;
            return dados[topo--];
        }
    }

    public void Imprime(){
        System.out.println(Arrays.toString(dados));
    }
}
