package desenvolvimento_de_aplicacoes_multicamadas.builder;

public class Main {

    public static void main(String[] args) {
        Carro carro01 = new Carro.Builder("GZH5489")
                .modelo("Civic LX")
                .ano(2001)
//                .cor("Preto")
                .motor("1.7")
                .nomeDono("João")
                .combustivel("Gasolina")
                .build();

        Carro carro02 = new Carro.Builder("KPK7381")
                .modelo("Fusca 1300L")
                .ano(1990)
                .cor("Azul")
//                .motor("1.3")
//                .nomeDono("Bruno")
                .combustivel("Gasolina")
                .build();

        carro01.imprimir();
        carro02.imprimir();

        // Sem a utilização do padrão de projeto:
        CarroErrado carro03 = new CarroErrado("GZH5489", null, 2001, "Preto", "1.7", "João", "Gasolina");
        CarroErrado carro04 = new CarroErrado("KPK7381", "Fusca 1300L", 1990, null, "1.3", "Bruno", "Gasolina");

        carro03.imprimir();
        carro04.imprimir();
    }
}
