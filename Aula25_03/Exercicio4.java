//ArithmeticException → Ocorre em operações matemáticas inválidas, como divisão por zero.

//ArrayIndexOutOfBoundsException → Ocorre ao tentar acessar um índice inválido em um array.

//NullPointerException → Ocorre ao tentar acessar um método ou atributo de um objeto nulo.

//InputMismatchException → Ocorre quando um tipo de dado errado é inserido no Scanner.

//NumberFormatException → Ocorre ao tentar converter uma string inválida para um número.


import java.util.Scanner;
import java.util.InputMismatchException;

public class TesteExcecoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Teste 1: InputMismatchException
        try {
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();
            System.out.println("Você digitou: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida para número inteiro.");
        }

        // Teste 2: ArithmeticException
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        }

        sc.close();
    }
}
