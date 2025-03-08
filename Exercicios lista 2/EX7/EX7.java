package EX7;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        while (true) {
        	 System.out.println("\nDigite seu Nome e Sua Nota  ");
             String nome = scanner.next();
             int nota = scanner.nextInt();
            
            System.out.println("A Nota do aluno "+nome + " é " + nota);
            
            if (nota == -1) {
            	
            	System.out.println(nome + " Sua Nota é " + nota + ", Reprovado");
                scanner.close();
                break;
            }
        }
    }
}