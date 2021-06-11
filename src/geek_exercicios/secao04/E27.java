package secao04;

public class E27 {
    public static void main(String[] args){
        int idade = 33;

        if(idade >= 5 && idade <= 7){
            System.out.println("Infantil A");
        }else if(idade >= 8 && idade <= 10){
            System.out.println("Infantil B");
        }else if(idade >= 11 && idade <= 13){
            System.out.println("Juvenil A");
        }else if(idade >= 14 && idade <= 17){
            System.out.println("Juvenil B");
        }else if(idade >= 0 && idade <= 4){
            System.out.println("Não tem classificação");
        }else
            System.out.println("Sênior");
    }
}
