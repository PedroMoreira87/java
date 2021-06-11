package aula05_pilha;

public class Main {

    public static void main(String[] args) throws Exception {

        Pilha p = new Pilha(5);
        Expressao e = new Expressao();

        p.empilhar(10);
        p.Imprime();
        p.empilhar(15);
        p.Imprime();
        p.empilhar(6);
        p.Imprime();
        p.empilhar(2);
        p.Imprime();
        p.empilhar(5);
        p.Imprime();
        System.out.println("==============================");
        System.out.println(p.desempilhar());
        p.Imprime();
        System.out.println(p.desempilhar());
        p.Imprime();
        System.out.println(p.desempilhar());
        p.Imprime();
        System.out.println(p.desempilhar());
        p.Imprime();
        System.out.println(p.desempilhar());
        p.Imprime();
        System.out.println("==============================");
        System.out.println(e.isValido("(1+5)*(56+12)"));
        System.out.println(e.isValido("(1+5)*)56+12)"));
        System.out.println(e.isValido("(1+5)*[56+12)"));
        System.out.println(e.isValido("(((1+2) - 3 )* 6)"));
        System.out.println(e.isValido(""));
        System.out.println(e.isValido("())"));
    }
}
