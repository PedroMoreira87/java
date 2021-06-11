package secao04;

import java.util.Scanner;

public class E39 {

    public static void reajuste() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu salário atual: ");
        double salario = scan.nextDouble();

        System.out.println("Digite o seu tempo de serviço na empresa: (em anos)");
        int tempo = scan.nextInt();

        if (salario <= 500) {
            System.out.printf("Salário reajustado: %.2f\n", salario *= 1.25);
            if (tempo < 1) {
                System.out.println("Sem bônus");
            }else if (tempo <= 3) {
                System.out.printf("Salário reajustado mais bônus: %.2f", salario += 100);
            }else if (tempo <= 6) {
                System.out.printf("Salário reajustado mais bônus: %.2f", salario += 200);
            }else if (tempo <= 10) {
                System.out.printf("Salário reajustado mais bônus: %.2f", salario += 300);
            }else{
                System.out.printf("Salário reajustado mais bônus: %.2f", salario += 500);
            }
        }else if (salario <= 1000) {
            System.out.printf("Salário reajustado: %.2f\n", salario *= 1.20);
            if (tempo < 1) {
                System.out.println("Sem bônus");
            }else if (tempo <= 3) {
                System.out.printf("Salário reajustado mais bônus: %.2f", salario += 100);
            }else if (tempo <= 6) {
                System.out.printf("Salário reajustado mais bônus: %.2f", salario += 200);
            }else if (tempo <= 10) {
                System.out.printf("Salário reajustado mais bônus: %.2f", salario += 300);
            }else{
                System.out.printf("Salário reajustado mais bônus: %.2f", salario += 500);
            }
        }else if (salario <= 1500) {
            System.out.printf("Salário reajustado: %.2f\n", salario *= 1.15);
            if (tempo < 1) {
                System.out.println("Sem bônus");
            }else if (tempo <= 3) {
                System.out.printf("Salário reajustado mais bônus: %.2f", salario += 100);
            }else if (tempo <= 6) {
                System.out.printf("Salário reajustado mais bônus: %.2f", salario += 200);
            }else if (tempo <= 10) {
                System.out.printf("Salário reajustado mais bônus: %.2f", salario += 300);
            }else{
                System.out.printf("Salário reajustado mais bônus: %.2f", salario += 500);
            }
        }else if (salario <= 2000) {
            System.out.printf("Salário reajustado: %.2f\n", salario *= 1.10);
            if (tempo < 1) {
                System.out.println("Sem bônus");
            }else if (tempo <= 3) {
                System.out.printf("Salário reajustado mais bônus: %.2f", salario += 100);
            }else if (tempo <= 6) {
                System.out.printf("Salário reajustado mais bônus: %.2f", salario += 200);
            }else if (tempo <= 10) {
                System.out.printf("Salário reajustado mais bônus: %.2f", salario += 300);
            }else{
                System.out.printf("Salário reajustado mais bônus: %.2f", salario += 500);
            }
        }else{
            System.out.println("Salário sem reajuste\n");
            if (tempo < 1) {
                System.out.println("Sem bônus");
            }else if (tempo <= 3) {
                System.out.printf("Salário mais bônus: %.2f", salario += 100);
            }else if (tempo <= 6) {
                System.out.printf("Salário mais bônus: %.2f", salario += 200);
            }else if (tempo <= 10) {
                System.out.printf("Salário mais bônus: %.2f", salario += 300);
            }else{
                System.out.printf("Salário mais bônus: %.2f", salario += 500);
            }
        }
    }

    public static void main(String[] args){
            reajuste();
    }
}
