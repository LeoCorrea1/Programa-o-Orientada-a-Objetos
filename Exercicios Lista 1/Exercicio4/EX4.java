package Exercicio4;

import java.util.Scanner;

public class EX4 {
public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);
	
	int vet[] = new int[4] , i;
				 
	System.out.println("digite um numero :");
	vet[0] =teclado.nextInt();
				  
	System.out.println("digite outro numero :");
	vet[1]= teclado.nextInt();
				  
	System.out.println("digite mais outro numero :");
	vet[2]= teclado.nextInt();
	
	System.out.println("digite mais um outro numero :");
	vet[3]= teclado.nextInt();
			 
	float media =(vet[0]+vet[1]+vet[2]+vet[3])/4;
	
	System.out.println("\nA media é :"+media);
	
	for(i=0;i<4;i++) {
		
		if(vet[i]>media) {
			System.out.println("numero acima da media :" +vet[i]);
			
		}
	}
			
}
		
}

		

