package programacao_orientada_a_objetos.aula09_2;
public class Compactado extends Arquivo{

    Pasta pasta;

    void descompactar(Disco d) {
        d.listaDePastas.add(pasta);
    }

    void listar() {
        pasta.listar();
    }
}
