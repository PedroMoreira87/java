package programacao_orientada_a_objetos.aula04;

public class Dependente {
    private String nome;

    public Dependente (String nome) {
        this.nome = nome;
    }

    public void imprimir (){
        System.out.println("Dependente" + nome);
    }

}
