package Exercicio7;

import java.util.Scanner;
import java.util.Arrays;

public class EX7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n = 3;
        int vetor[] = new int[n];
        
        System.out.println("Digite um número:");
         vetor[0] = teclado.nextInt();
        System.out.println("Digite outro número:");
         vetor[1] = teclado.nextInt();
        System.out.println("Digite mais um número:");
         vetor[2] = teclado.nextInt();
        
        Arrays.sort(vetor);
        
        System.out.println("Números em ordem crescente:");
        for (int i = 0; i < n; i++) {
            System.out.println(vetor[i]);
        }
        

    }
}
