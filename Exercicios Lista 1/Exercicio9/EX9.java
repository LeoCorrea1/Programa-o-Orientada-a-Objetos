package Exercicio9;

import java.util.Scanner;

public class EX9 {
	
	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);
	
	int idade;
	

	 System.out.println("digite sua idade :");
	 idade =teclado.nextInt();
	 
	 if(idade<16)
	   System.out.printf("pessoa não está apta a votar");
	 if(idade>=16 && idade<18 || idade>70) 
	   System.out.printf("seu voto é facultativo");
	 if(idade>=18 && idade<70)
	   System.out.println("Voto obrigatorio");
	 }
   }
