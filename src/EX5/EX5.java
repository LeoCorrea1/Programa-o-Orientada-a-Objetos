package EX5;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in);
    	
        int i, num;
        int fatorial=1;
        
        System.out.println("digite um numero para relizar a fatorial : ");
        num =teclado.nextInt();
        
        for(int i1 = 1; i1 <=num; i1++) { 
        	fatorial*= i1;
        }
        System.out.println("fatorial  de " +num +" = " +fatorial); 
        }
    }
