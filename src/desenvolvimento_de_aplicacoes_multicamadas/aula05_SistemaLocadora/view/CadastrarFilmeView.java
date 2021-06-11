package desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.view;

import java.util.Scanner;
import desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.model.Filme;

public class CadastrarFilmeView {
    
    public Filme telaDeCadastro(Filme f){
        
        f = new Filme();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome filme: ");
        f.setTitulo(sc.next());
        
        System.out.print("Id locadora: ");
        f.setId_locadora(sc.nextInt());

        return f;
        
    }
}
