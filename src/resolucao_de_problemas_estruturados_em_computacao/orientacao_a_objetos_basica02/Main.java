package resolucao_de_problemas_estruturados_em_computacao.orientacao_a_objetos_basica02;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Pais brasil = new Pais("BRA", "Brasil", 8515767.049, 211000000);
        brasil.setFronteira("Suriname");
        brasil.setFronteira("Guiana");
        brasil.setFronteira("Venezuela");
        brasil.setFronteira("Guiana Francesa");
        brasil.setFronteira("Colômbia");
        brasil.setFronteira("Peru");
        brasil.setFronteira("Bolívia");
        brasil.setFronteira("Paraguai");
        brasil.setFronteira("Argentina");
        brasil.setFronteira("Uruguai");

        Pais argentina = new Pais("ARG", "Argentina", 2791810, 44094000);
        argentina.setFronteira("Chile");
        argentina.setFronteira("Bolívia");
        argentina.setFronteira("Paraguai");
        argentina.setFronteira("Brasil");
        argentina.setFronteira("Uruguai");


        Pais paraguai = new Pais("PRY", "Paraguai", 406752, 7045000);
        paraguai.setFronteira("Argentina");
        paraguai.setFronteira("Bolívia");
        paraguai.setFronteira("Brasil");

        brasil.imprimir();
        argentina.imprimir();
        paraguai.imprimir();

        // Usando metodos
        System.out.println(brasil.isIgual(argentina));
        System.out.println(brasil.isVizinho(argentina));

        //Usando comandos
        System.out.println(brasil.getIso().equals(argentina.getIso()));
        System.out.println(brasil.getFronteira().contains(argentina.getNome()));


        System.out.println(brasil.densidade());

        //Usando comandos
        ArrayList<String> vizinhoComuns;
        vizinhoComuns = (ArrayList<String>) brasil.getFronteira().clone();
        vizinhoComuns.retainAll(argentina.getFronteira());
        System.out.println(vizinhoComuns);

        //Usando for
        ArrayList<String> vizinhoComuns1 = new ArrayList<>();
        for (int i = 0; i < brasil.getFronteira().size(); i++){
            for (int j = 0; j < argentina.getFronteira().size(); j++){
                if (brasil.getFronteira().get(i).equals(argentina.getFronteira().get(j))) {
                    vizinhoComuns1.add(brasil.getFronteira().get(i));
                }
            }
        }
        System.out.println(vizinhoComuns1);
    }
}
