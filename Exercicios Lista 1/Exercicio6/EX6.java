package Exercicio6;
import java.util.Scanner;


public class EX6 {

	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);
		 
	 int num1 ;
	 System.out.println("digite um numero :");
	 num1 =teclado.nextInt();
		  
	 int num2 ;
	 System.out.println("digite outro numero :");
     num2= teclado.nextInt();
		  
	 int num3 ; 
	 System.out.println("digite outro numero :");
	 num3= teclado.nextInt();
	 
	 if(num1>num2 && num1>num3) 
		 System.out.println("o mair numero é"+num1); 
	 
		 if(num2>num1 && num2>num3) 
			 System.out.println("o maior numero é"+num2); 
			 
			 if(num3>num2 && num3>num1) 
				 System.out.println("o maior numero é:" +num3);  
	   }
	 }
	
	