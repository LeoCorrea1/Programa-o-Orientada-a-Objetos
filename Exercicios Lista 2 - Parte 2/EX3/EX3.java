package EX3;

import java.util.Scanner;


public class EX3 {

public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	        
	int soma = 0;
	int[] notas = new int[5];

	for (int i = 0; i < 5; i++) {
		System.out.print("Digite sua Nota : ");
		notas[i] = scanner.nextInt(); 
		soma += notas[i]; 
		
	}
	float media = soma/5;
	System.out.println("\nA media das Notas é : " + media);
	
}

}
	



	