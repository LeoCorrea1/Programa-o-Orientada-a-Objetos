package Exercicio1;

import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int soma, multi, sub;
        float div;

        System.out.println("Digite um número:");
        int num1 = teclado.nextInt();
        System.out.println("Digite outro número:");
        int num2 = teclado.nextInt();

        soma = num1 + num2;
        multi = num1 * num2;
        sub = num1 - num2;

        System.out.println("Soma dos dois números: " + soma);
        System.out.println("Multiplicação dos dois números: " + multi);
        System.out.println("Subtração dos dois números: " + sub);

        if (num2 != 0) {
            div = num1 / num2;
            System.out.println("Divisão dos dois números: " + div);
        } else {
            System.out.println("Divisão impossivelk.");
        }
    }
}