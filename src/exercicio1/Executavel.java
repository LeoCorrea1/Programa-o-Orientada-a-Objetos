package exercicio1;

import java.util.Scanner;

public class Executavel {

public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in); 
   
   carro c  = new carro();
   carro c2  = new carro();
  
   System.out.println("qual a marca do carro ?");
   c.marca = scanner.nextLine();
   System.out.println("qual o modelo do carro ?");
   c.modelo = scanner.nextLine();
   System.out.println("Qual o ano de fabricaçao ?");
   c.anoFabricacao = scanner.nextInt();
   
   System.out.println("qual a marca do carro ?");
   c2.marca = scanner.nextLine();
   System.out.println("qual o modelo do carro ?");
   c2.modelo = scanner.nextLine();
   System.out.println("Qual o ano de fabricaçao ?");
   c2.anoFabricacao = scanner.nextInt();
   
   
   System.out.println("\nMarca do carro : " +c.marca);
   System.out.println("Modelo do carro : " +c.modelo);
   System.out.println("Ano de Fabricaçao : " +c.anoFabricacao);
   System.out.println("\nMarca do segundo carro : " +c2.marca);
   System.out.println("Modelo do segundo carro : " +c2.modelo);
   System.out.println("Ano de Fabricaçao do segundo carro : " +c2.anoFabricacao);
   
   
   
		
	}
}