package Exercicio8;

import java.util.Scanner;

public class EX8 {
	

public static void main(String[] args) {
	
  Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro valor: ");
	int valor1 = scanner.nextInt();

	System.out.print("Digite o segundo valor: ");
	int valor2 = scanner.nextInt();

	if (valor1 % valor2 == 0) {
	System.out.println(valor1 + " é múltiplo de " + valor2);
	} if (valor2 % valor1 == 0) {
		System.out.println(valor2 + " é múltiplo de " + valor1);
	} else {
		System.out.println("Os valores não são múltiplos um do outro.");
 }

 }
}



