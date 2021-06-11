package desenvolvimento_de_aplicacoes_multicamadas.aula11.view;

import desenvolvimento_de_aplicacoes_multicamadas.aula11.model.Pessoa;
import java.util.Scanner;

public class CadastroView {
    
    public Pessoa telaDeCadastro(){
        
        Pessoa p = new Pessoa();
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o usuario: ");
        p.setUsuario(s.next());
        
        System.out.print("Digite a senha: ");
        p.setSenha(s.next());
        
        return p;
        
    }
    
    
}
