package exercicio2;

import java.util.Scanner;

public class Computador {
	String marca ;
	String modelo;
	int preço;
	String tipo;
	
	public void PergutaCarro1() {
        Scanner scanner = new Scanner(System.in); 
    
       System.out.println("qual a marca  do primeiro computador ?");
 	   this.marca = scanner.nextLine();
 	   System.out.println("qual o modelo  do primeiro computador ?");
 	   this.modelo = scanner.nextLine();
 	   System.out.println("Qual preço do primeiro computador ?");
 	   this.preço = scanner.nextInt();
 	   
 	   scanner.nextLine();
 	   
 	   System.out.println("Qual o tipo do primeiro computador ?");
 	   this.tipo = scanner.nextLine();
        
	}
}
