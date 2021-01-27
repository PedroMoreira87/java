package poo;

import java.util.ArrayList;

public class Orquestra {
    public static void main(String[] args) {
        Piano p = new Piano();
        Guitarra g = new Guitarra();

        p.soar();
        g.soar();

        InstrumentoMusical x = p;
        x.soar();

        x = g;
        x.soar();

        ArrayList<InstrumentoMusical> instrumentos;

        instrumentos = new ArrayList<InstrumentoMusical> ();
        instrumentos.add(new Piano());
        instrumentos.add(new Guitarra());
        instrumentos.add(new Guitarra());

        for (InstrumentoMusical i: instrumentos)
            i.soar(); // late binding

    }
}
