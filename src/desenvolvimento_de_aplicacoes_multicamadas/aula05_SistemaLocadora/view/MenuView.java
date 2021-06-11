package desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.view;

import java.util.Scanner;

public class MenuView {
 
    public int telaDeMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("(1) Cadastrar Locadora");
        System.out.println("(2) Cadastrar Filme");
        System.out.println("(3) Listar Filme");
        System.out.println("(4) Editar Filme");
        System.out.println("(5) Excluir Filme");
        System.out.println("(9) Sair\n");
        System.out.print("    Opção: ");
        
        return sc.nextInt();
    }
    
    
    public void telaOpcaoInvalida(){
        System.out.println(" *** Opção Inválida *** ");
    }
}
