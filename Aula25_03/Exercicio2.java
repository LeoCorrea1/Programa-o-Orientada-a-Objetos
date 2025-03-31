package Lista4.Exercicio2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0, num2 = 0;
        int soma, multi, sub;
        float div = 0;

        try {
            System.out.print("Digite um número: ");
            num1 = sc.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("erro: " + e.toString());
            sc.nextLine();
            return;
        }

        try {
            System.out.print("Digite outro número: ");
            num2 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("erro: " + e.toString());
            return;
        }

        soma = num1 + num2;
        multi = num1 * num2;
        sub = num1 - num2;

        System.out.println("Soma dos dois números: " + soma);
        System.out.println("Multiplicação dos dois números: " + multi);
        System.out.println("Subtração dos dois números: " + sub);

        if (num2 != 0) {
            div = (float) num1 / num2;
            System.out.println("Divisão dos dois números: " + div);
        } else {
            System.out.println("Divisão impossível.");
        }

        sc.close();
    }
}
