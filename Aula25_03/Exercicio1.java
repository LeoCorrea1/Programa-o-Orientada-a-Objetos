package Lista3.Aula25_03;

import java.util.InputMismatchException;
import java.util.Scanner;

//1 - Escreva um programa que solicita ao usuário para digitar um número inteiro e exiba a raiz quadrada desse número. Certifique-se de que o programa trate adequadamente
//as exceções se o usuário digitar um valor inválido, por exemplo, ler um char ou string.

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");


        try {
            int num = sc.nextInt();
            System.out.println(Math.sqrt(num));
        }
        catch( InputMismatchException e) {
            System.out.println("erro: " + e.toString());
        }

    sc.close();
        }
    }

