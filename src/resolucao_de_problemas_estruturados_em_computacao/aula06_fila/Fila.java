package aula06_fila;

import java.util.Arrays;

public class Fila {
    // o índice do primeiro elemento
    private int primeiro;
    // o índice do ultimo elemento
    private int ultimo;
    // armazenamento de dados
    private int[] dados;
    // capacidade máxima do array
    private int capacidade;
    private int contador;

    public int getPrimeiro() {
        return primeiro;
    }

    public int getUltimo() {
        return ultimo;
    }

    public Fila(int tamanho) {
        this.dados = new int[tamanho];
        this.capacidade = tamanho;
        primeiro = 0;
        ultimo = -1;
        contador = 0;
    }

    public void Insere(int num) {
        if (isFull()) {
            System.out.println("Não tem o que adicionar. A fila está cheia!");
            return;
        }
        System.out.println("Inserindo " + num);
        ultimo = (ultimo + 1) % capacidade;
        dados[ultimo] = num;
        contador++;
    }

    public void Remove() {
        if (isEmpty()) {
            System.out.println("Não tem o que remover. A fila está vazia!");
            return;
        }
        System.out.println("Removendo " + dados[primeiro]);
        dados[primeiro] = 0;
        primeiro = (primeiro + 1) % capacidade;
        contador--;
    }

    // retorna o primeiro elemento da fila
    public int retornaPrimeiroElemento() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            System.exit(1);
        }
        return dados[primeiro];
    }

    public int tamanho() {
        return contador;
    }

    public boolean isEmpty() {
        return (tamanho() == 0);
    }

    public boolean isFull() {
        return (tamanho() == capacidade);
    }

    public void Imprime() {
        System.out.println(Arrays.toString(dados));
    }
}

