package EX10;

import java.util.Scanner;


public class EX10 {

public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
		
	int soma = 0;
	int i = 0;
	int num;

	System.out.println("Digite números:");

	while ((num = scanner.nextInt()) != 0) {
		soma += num;
		i++;
	}
		System.out.println("Média: " + (soma / i));

  }
}

	

