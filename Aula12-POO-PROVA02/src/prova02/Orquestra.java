package prova02;

import java.util.ArrayList;

public class Orquestra {
    private ArrayList<InstrumentoMusical> instrumentos;
    private String nome;

    public Orquestra(String nome) {
        this.instrumentos = new ArrayList<>();
        this.nome = nome;
    }

    public static void main(String[] args) {

        Orquestra orq = new Orquestra("Orquestra Filarmonica");
        Orquestra sinf = new Orquestra("Orquestra Sinfonica");

        try{
            orq.addInstrumento(new Violino(2, 1000, 2, "1/2"));
            orq.addInstrumento(new Violino(2, 2000, 4, "3/4"));
            orq.addInstrumento(new Violino(3, 500, 20, "1/2"));
            orq.addInstrumento(new Violino(2, 1300, 2, "5"));
            sinf.addInstrumento(new Violino(5, 800, 4, "4/4"));
        }catch (ExcecaoViolinoInvalido e){
            System.out.println(e.getMessage());
        }

        try{
            orq.addInstrumento(new Piano(1, 3000, 88, "Digital"));
            orq.addInstrumento(new Piano(2, 10000, 88, "Acustico de cauda"));
            orq.addInstrumento(new Piano(2, 3455, 90, "Digital"));
            orq.addInstrumento(new Piano(1, 5000, 55, "Acustico de cauda"));
            sinf.addInstrumento(new Piano(8, 5000, 88, "Acustico"));
        }catch (ExcecaoPianoInvalido e){
            System.out.println(e.getMessage());
        }

        orq.imprimeOrquestra();
        sinf.imprimeOrquestra();
    }

    public void addInstrumento(InstrumentoMusical instrumento){
        this.instrumentos.add(instrumento);
    }

    public void imprimeOrquestra(){
        System.out.println(this.nome);
        System.out.println("==============================");

        for (InstrumentoMusical i: instrumentos) {
            i.imprime();
        }
    }
}
