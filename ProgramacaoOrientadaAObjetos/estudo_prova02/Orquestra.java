package estudo_prova02;

import java.util.ArrayList;

public class Orquestra {
    private ArrayList<InstrumentoMusical> instrumentos;
    private String nome;

    public Orquestra(String nome) {
        this.nome = nome;
        instrumentos = new ArrayList<>();
    }

    public static void main(String[] args) {

        Orquestra filarmonica = new Orquestra("Orquestra Filarmonica");
        Orquestra sinfonica = new Orquestra("Orquestra Sinfonica");

        try {
            filarmonica.addInstrumento(new Piano(1, 3000, 88, "Digital"));
            filarmonica.addInstrumento(new Piano(2, 10000, 88, "Acustico de cauda"));
            filarmonica.addInstrumento(new Piano(3, 250, 20, "Digital"));
            filarmonica.addInstrumento(new Piano(1, 550, 34, "Acustico de cauda"));
            sinfonica.addInstrumento(new Piano(10, 5000, 88, "Acustico"));
        }catch (ExcecaoPianoInvalido e){
            System.out.println(e.getMessage());
        }
        try {
            filarmonica.addInstrumento(new Violino(2, 1000, "1/2", 4));
            filarmonica.addInstrumento(new Violino(2, 890, "3/4", 4));
            filarmonica.addInstrumento(new Violino(5, 440, "5", 2));
            sinfonica.addInstrumento(new Violino(5, 800, "4/4", 4));
        }catch (ExcecaoViolinoInvalido e){
            System.out.println(e.getMessage());
        }

        filarmonica.imprimeOrquestra();
        sinfonica.imprimeOrquestra();
    }

    public void addInstrumento(InstrumentoMusical instrumento){
        this.instrumentos.add(instrumento);
    }

    public void imprimeOrquestra(){
        System.out.println(nome);
        System.out.println("=====================");

        for (InstrumentoMusical i : instrumentos){
            i.imprime();
        }
    }
}
