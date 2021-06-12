package desenvolvimento_de_aplicacoes_multicamadas.aula03.ex02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("oi", "dsds", "dsdsd");

        Album album1 = new Album("Punk rock", 2003, "Linkin Park", new Pessoa("Brunbo", "00000000000","00000000"));

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o gênero do álbum");
        album1.setGenero(scan.next());
        System.out.println("Digite o ano do álbum");
        album1.setAno(scan.nextInt());
        System.out.println("Digite o nome do álbum");
        album1.setNome(scan.next());
        System.out.println("Digite o artista do álbum");
        album1.setNome(scan.next());
    }
}
