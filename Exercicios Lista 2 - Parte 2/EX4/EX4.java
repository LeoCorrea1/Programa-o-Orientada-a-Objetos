package EX4;

import java.util.Scanner;

public class EX4 {

public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

 int[][] notas = new int[3][4];
 
 for (int i = 0; i < 3; i++) {
	for (int j = 0; j < 4; j++) {
	  System.out.print("Digite A Nota do aluno " +(i+1) + " Na disciplina " +(j+1) +" é : ");
	   notas[i][j] = scanner.nextInt();
  } 
}
  for (int j = 0; j < 4; j++) {
	 int soma = 0;
	 
	 for (int i = 0; i < 3; i++) {
		 soma += notas[i][j];
	  }
	   
System.out.println("Média da disciplina " +(j+1) + ": " + soma / 3);

	 }
  }	
}
