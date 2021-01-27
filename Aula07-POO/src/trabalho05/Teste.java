package trabalho05;

public class Teste {
    public static void main(String[] args) {
        Jogador Bruno = new Jogador("Bruno",10);
        Principiante Jean = new Principiante("Jean",10,10);
        Profissional David = new Profissional("David",10,10);
        Senior Pedro = new Senior("Pedro", 10,10,10);

        System.out.println("~~~~ PLACAR DE PONTUAÇÃO ~~~~");
        Bruno.imprimir();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Jean.ganhar(2);
        Jean.imprimir();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        David.ganhar(2);
        David.imprimir();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Pedro.perder(2);
        Pedro.imprimir();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}