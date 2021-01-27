package estudo01;

import java.util.ArrayList;

public class Sistema {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("João");
        Pessoa p1 = new Pessoa("Carlos");
        Pessoa p2 = new Pessoa("Paulo");
        Pessoa p3 = new Pessoa("Pedro");
        Pessoa p4 = new Pessoa("Roberto");

        ArrayList<Pessoa> lista = new ArrayList<>();

        lista.add(p);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        p.setNome("Julia");

        System.out.println("Lista: " + lista);

        lista.remove(1);

        Pessoa nome1 = lista.get(1);

        // pode tbm ser usado lista.remove(nome1)

        System.out.println("===============\n" + nome1.getNome() + "\n===============");

        for (Pessoa i : lista){ // o 1 nome é o tipo do objeto, o 2 é um nome dado no for e o 3 nome do array
            System.out.println(i.getNome());
        }
    }
}

// no diagrama o - é private o + é public e o # protect