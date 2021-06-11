package desenvolvimento_de_aplicacoes_multicamadas.aula11.view;

import java.util.Scanner;

public class MenuView {
    
    private int opcao;

    public int telaDeMenu(){
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("(1) Cadastrar Usuário");
        System.out.println("(2) Entrar");
        System.out.println("(9) Sair");
        System.out.print("\nOpção: ");
        
        this.opcao = s.nextInt();
        
        return this.opcao;
    }
    
    
}
