package programacao_orientada_a_objetos.aula09_2;

public class Sistema {

    public static void main(String args[]) {

        Disco d = new Disco('C');

        Pasta escola = d.criarPasta("Escola");
        Pasta pessoal = d.criarPasta("Pessoal");

        System.out.println("DISCO (C:)");
        d.listarPastas();

        Texto t = new Texto("Trabalho 10", 8, 4);
        escola.inserir(t);

        Apresentacao a = new Apresentacao("Defesa Projeto 2", 27, 3);
        escola.inserir(a);

        Planilha p = new Planilha("Calculo 2", 40, 6);
        escola.inserir(p);

        System.out.println("PASTA ESCOLA: ");
        escola.listar();

        Video v = new Video("Aniversario", 33, 5);
        pessoal.inserir(v);

        Imagem i = new Imagem("Foto RJ", 70, 2);
        pessoal.inserir(i);

        Som s = new Som("Musica Chico", 70, 2);
        pessoal.inserir(s);

        System.out.println("PASTA PESSOAL: ");
        pessoal.listar();

        Compactado k = pessoal.compactar();

        System.out.println("********** Disco ANTES de REMOVER pasta [pessoal] **********");
        d.listarPastas();
        d.removerPasta("Pessoal");

        System.out.println("********** Disco DEPOIS de REMOVER pasta [pessoal] **********");
        d.listarPastas();

        k.descompactar(d);
        System.out.println("********** Disco DEPOIS de DESCOMPACTAR pasta [pessoal] **********");
        d.listarPastas();

        System.out.println("********** Pasta [escola] executa todos os arquivos **********");
        escola.abrirTodosArquivos();

        System.out.println("********** Pasta [pessoal] executa todos os arquivos **********");
        pessoal.abrirTodosArquivos();

        escola.remover("Trabalho 10");
        escola.duplicar("Defesa Projeto 2");
        System.out.println("Pasta [escola] DEPOIS de: ");
        System.out.println("  * REMOVER arquivo [Trabalho 10]");
        System.out.println("  * DUPLICAR arquivo [Defesa Projeto 2]");
        System.out.println();
        escola.listar();
    }

}
