package aula02;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("Vilmar");
        p1.setCpf("000.000.000-00");
        p1.setTelefone("99999999");

        Pessoa p2 = new Pessoa("Vilmar", "000.000.000-00", "99999999");

        String s1 = "oi";
        String s2 = "oi";

        System.out.println(p1.getNome());

        Funcionario p3 = new Funcionario();

        p3.Imprimir();
        p3.Imprimir("87");







    }
}
