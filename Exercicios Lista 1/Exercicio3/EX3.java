package Exercicio3;

import java.util.Scanner;

public class EX3 {
	
	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);
	
	int  par , impar;
	

	 System.out.println("digite um numero :");
	 int num1 =teclado.nextInt();
	 
	 if(num1%2==0)
	   System.out.printf("o numero é par:"+num1);
	 else
	   System.out.printf("o numero é impar: "+num1);
	
	 }
}
