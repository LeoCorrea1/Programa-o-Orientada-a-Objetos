package Exercicio10;

import java.util.Scanner;

public class EX10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int soma, multi, sub;
        int opcao;
        float div;

        System.out.println("Digite um número:");
        int num1 = teclado.nextInt();
        System.out.println("Digite outro número:");
        int num2 = teclado.nextInt();

        soma = num1 + num2;
        multi = num1 * num2;
        sub = num1 - num2;
        
        System.out.println("\nescolha as opçoes a seguir digitando o numero referente a elas: ");
        System.out.println("\n1)SOMA: ");
        System.out.println("\n2)SUBTRAÇAO: ");
        System.out.println("\n3)MULTIPLICAÇAO: ");
        System.out.println("\n4)DIVISAO: ");
        opcao = teclado.nextInt();
        
	    switch (opcao){
	    case 1:
	    	System.out.println("Soma dos dois números: " + soma);
	    	break;
	    case 2:
	    	 System.out.println("Subtração dos dois números: " + sub);
	    	break;
	    case 3:
	    	System.out.println("Multiplicação dos dois números: " + multi);
	    	break;
	    case 4:
	    	if (num2 != 0) {
	            div = num1 / num2;
	            System.out.println("Divisão dos dois números: " + div);
	        } else {
	            System.out.println("Divisão impossivel.");
	        }
	    	break;
	   }
   }
}

   
    
