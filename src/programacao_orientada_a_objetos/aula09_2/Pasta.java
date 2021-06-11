package aula09_2;
import java.util.ArrayList;

public class Pasta {

    String nome;
    ArrayList<Arquivo> listaDeArquivos = new ArrayList<>();

    void inserir(Arquivo arquivo){
        listaDeArquivos.add(arquivo);
    }

    void remover(String nome){
        for(Arquivo arquivo : listaDeArquivos) {
            if(arquivo.nome.equals(nome)) {
                listaDeArquivos.remove(arquivo);
                return;
            }
        }
    }

    void listar(){
        for(Arquivo arquivo : listaDeArquivos) {
            arquivo.imprimirNome();
        }
        System.out.println("");
    }

    Compactado compactar(){
        Compactado compactado = new Compactado();

        compactado.pasta = this;

        return compactado;
    }

    void abrirTodosArquivos(){
        for(Arquivo arquivo : listaDeArquivos) {
            arquivo.abrir();
        }
        System.out.println();
    }

    void duplicar(String nome){
        for(Arquivo arquivo : listaDeArquivos) {
            if(arquivo.nome.equals(nome)) {
                Arquivo arquivoCopia = new Arquivo();
                arquivoCopia.nome = arquivo.nome;
                arquivoCopia.endereco = arquivo.endereco;
                arquivoCopia.totalBlocos = arquivo.totalBlocos;
                listaDeArquivos.add(arquivoCopia);
                break;
            }
        }
        int ultimoID = (listaDeArquivos.size()-1);
        listaDeArquivos.get(ultimoID).nome += " (Copia)";
    }

    void imprimirNome(Arquivo arquivo){
        System.out.println("Nome do arquivo: " + arquivo.nome);
    }
}
