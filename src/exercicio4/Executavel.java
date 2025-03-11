package exercicio4;

import java.util.Scanner;

import exercicio2.Computador;

public class Executavel {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in); 
		   
	Livro l= new Livro();
	
	System.out.println("qual o o titulo do livro ? ");
	l.titulo= scanner.nextLine();
	System.out.println("qual o(a) autor(a) ? ");
	l.autor = scanner.nextLine();
	System.out.println("qual o ano de publicaçao ? ");
	l.anoPublicacao = scanner.nextInt();
	
	
	System.out.println("\ntitulo do livro : "+l.titulo);
	System.out.println("o(a) autor(a) : "+l.autor);
	System.out.println("ano de publicaçao : "+l.anoPublicacao);
		 
	}
	
	}

	

