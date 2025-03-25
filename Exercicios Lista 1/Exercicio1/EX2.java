package Lista3.Aula25_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int soma, multi, sub;
        float div;

        try {

            System.out.println("Digite um número:");
            int num1 = teclado.nextInt();
            System.out.println("Digite outro número:");
            int num2 = teclado.nextInt();
            soma = num1 + num2;
            multi = num1 * num2;
            sub = num1 - num2;
            div = num1 / num2;
            System.out.println("Soma dos dois números: " + soma);
            System.out.println("Multiplicação dos dois números: " + multi);
            System.out.println("Subtração dos dois números: " + sub);
            System.out.println("divisao dos dois numeros " + div);

        } catch (InputMismatchException e) {
            System.out.println("erro : " + e.toString());
        }
        catch( ArithmeticException e) {
            System.out.println("erro : " + e.toString());
        }

    }
}
