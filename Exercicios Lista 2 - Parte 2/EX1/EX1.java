package EX1;

import java.util.Scanner;


public class EX1 {

public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	        
	      
	String[] nomes = new String[5];

	for (int i = 0; i < 5; i++) {
		System.out.print("Digite um Nome : ");
		nomes[i] = scanner.nextLine();  
	}

	System.out.println("\nOs nomes  foram:");
	for (int i = 0; i < 5; i++) {
		System.out.println(nomes[i]);
}

}
	}



	