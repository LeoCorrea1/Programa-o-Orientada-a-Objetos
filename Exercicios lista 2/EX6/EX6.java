package EX6;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite números inteiros :");
        
        while (true) {
            numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            System.out.println("Número digitado: " + numero);
        }
        
        System.out.println("Numero 0 lido , Saindo");
        scanner.close();
    }
}