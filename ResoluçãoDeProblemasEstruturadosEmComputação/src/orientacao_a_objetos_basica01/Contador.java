package orientacao_a_objetos_basica01;

public class Contador {

    private int contador = 0;

    public void retornar(){
        for (int i = 0; i < 5; i++){
            this.contador++;
        }
        System.out.println(contador);
    }

    public void zerar(){
        this.contador = 0;
        System.out.println(contador);
    }

    public void incrementar(){
        this.contador++;
        System.out.println(contador);
    }
}
