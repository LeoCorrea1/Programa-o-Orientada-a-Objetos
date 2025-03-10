package Exercicio5;

import java.util.Scanner;

public class EX5 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = scanner.nextInt();
        
        if (x > 0 && y > 0) {
             System.out.println("O ponto está no primeiro quadrante.");
        }if (x < 0 && y > 0) {
             System.out.println("O ponto está no segundo quadrante.");
        }if  (x < 0 && y < 0) {
             System.out.println("O ponto está no terceiro quadrante.");
        }if  (x > 0 && y < 0) {
             System.out.println("O ponto está no quarto quadrante.");
        }if  (x == 0 && y == 0) {
             System.out.println("O ponto está na origem.");
        }if (x == 0) {
             System.out.println("O ponto está sobre o eixo Y.");
        }else {
             System.out.println("O ponto está sobre o eixo X.");
        }
 
    }
}

