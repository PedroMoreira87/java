package desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.view;
import java.util.Scanner;
import desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.model.Locadora;

public class CadastrarLocadoraView {

   
    public Locadora telaDeCadastro(Locadora l){
        
        l = new Locadora();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome locadora: ");
        l.setNome(sc.next());
        
        System.out.print("Endereço locadora: ");
        l.setEndereco(sc.next());
        
        return l;
        
    }
}
