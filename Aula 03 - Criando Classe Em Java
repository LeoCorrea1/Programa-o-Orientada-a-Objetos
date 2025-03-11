PROJETO MAIN: 

package Teste2;

import java.util.Scanner;

public class disciplina {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); 
	
Professor p = new Professor();
Laboratorio l = new Laboratorio();

 p.perguntarDados();
 l.perguntarDados2();


 Professor p2 = new Professor();
 Laboratorio l2 = new Laboratorio();
 System.out.println("\nQual o nome do professor?");
 p2.nome = scanner.nextLine();
 System.out.println("Qual o local do laboratorio?");
 l2.Local = scanner.nextLine();
 
 
 System.out.println("\nNome do primero professor : " +p.nome);
 System.out.println("Local do primeiro Lab : " +l.Local);
 
 System.out.println("\nNome do  segundo professor : " +p2.nome);
 System.out.println("Local do segundo Lab : " +l2.Local);
 

}
}

	

CLASSE PROFESSOR : 
package Teste2;

import java.util.Scanner;

public class Professor {
    public String nome;
    
public class Laboratorio{
	public String Local;
	
}
    public void perguntarDados() {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Qual o nome do professor?");
        this.nome = scanner.nextLine();
    }
}


CLASSE LABORATORIO : 

package Teste2;

import java.util.Scanner;


public class Laboratorio {
	public String Local;
	
	public void perguntarDados2() {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Qual o local do laboratorio?");
        this.Local = scanner.nextLine();

	}
}


