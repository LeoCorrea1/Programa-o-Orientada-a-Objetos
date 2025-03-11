package exercicio2;

import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {

	   Scanner scanner = new Scanner(System.in); 
	   
	   Computador c  = new Computador();
	   Computador c2  = new Computador();
	   
	   c2.marca = "ryzen";
	   c2.modelo = "7 7600x";
	   c2.tipo = "notebook";
	   c2.preço = 15000;
	  
	   c.PergutaCarro1();
	   
	   System.out.println("\nMarca do primeiro computador : " +c.marca);
	   System.out.println("Modelo do primeiro computador : " +c.modelo);
	   System.out.println("preço do primeiro computador : " +c.preço);
	   System.out.println("o tipo do primeiro computador  : "+c.tipo);
	   
	   System.out.println("\nMarca do segundo computador : " +c2.marca);
	   System.out.println("Modelo do segundo computador : " +c2.modelo);
	   System.out.println("preço do segundo computador : " +c2.preço);
	   System.out.println("o tipo do segundo computador  : " +c2.tipo);
	  
		}
	}
	

