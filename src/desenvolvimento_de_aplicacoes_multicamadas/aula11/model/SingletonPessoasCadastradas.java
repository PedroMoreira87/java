package desenvolvimento_de_aplicacoes_multicamadas.aula11.model;

import java.util.ArrayList;

public class SingletonPessoasCadastradas {
    
    private static SingletonPessoasCadastradas singletonPessoasCadastradas;
    private ArrayList<Pessoa> listaPessoa;
    
    private SingletonPessoasCadastradas(){
        this.listaPessoa = new ArrayList<Pessoa>();
    }
    
    public static SingletonPessoasCadastradas getInstance(){
        
        if(singletonPessoasCadastradas == null) {
            singletonPessoasCadastradas = new SingletonPessoasCadastradas();
        }
        
        return singletonPessoasCadastradas;
    }
    
    public void setPessoa(Pessoa p){
        this.listaPessoa.add(p);
    }
    
    public ArrayList<Pessoa> getPessoa(){
        return this.listaPessoa;
    }

    
}
