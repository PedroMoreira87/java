package desenvolvimento_de_aplicacoes_multicamadas.aula11.view;

import desenvolvimento_de_aplicacoes_multicamadas.aula11.model.Pessoa;
import java.util.Scanner;

public class LoginView {
    
    
    public Pessoa telaDeLogin(){
        
        Pessoa p = new Pessoa();
       
        Scanner s = new Scanner(System.in);
        
        System.out.print("Usuario: ");
        p.setUsuario(s.next());
        
        System.out.print("Senha: ");
        p.setSenha(s.next());
        
        return p;
        
    }
}
