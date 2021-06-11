package resolucao_de_problemas_estruturados_em_computacao.aula02;

public class Funcionario extends Pessoa{

    private String matricula;


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void Imprimir(){
        System.out.println(this.getNome());
        System.out.println(this.matricula);
    }

    public String Imprimir(String rg){
        System.out.println(this.getNome());
        System.out.println(this.matricula);
        return rg;
    }

}
