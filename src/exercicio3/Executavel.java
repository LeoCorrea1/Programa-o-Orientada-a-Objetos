package exercicio3;

import java.util.Scanner;

import exercicio2.Computador;

public class Executavel {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in); 
		   
	pessoa p = new pessoa();
	
	System.out.println("qual o nome da pessoa ? ");
	p.nome = scanner.nextLine();
	System.out.println("qual a idade da pessoa ? ");
	p.idade = scanner.nextInt();
	scanner.nextLine();
	
	System.out.println("qual o genero  da pessoa ? ");
	p.genero = scanner.nextLine();
	
	
	System.out.println("\nnome da pessoa : "+p.nome);
	System.out.println("idade da pessoa : "+p.idade);
	System.out.println("genero da pessoa : "+p.genero);
		 
	}
	
	}

	

