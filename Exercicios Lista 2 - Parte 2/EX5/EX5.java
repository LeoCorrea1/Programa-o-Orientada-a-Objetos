package EX5;

import java.util.Scanner;

public class EX5 {
	
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int auxMenor = 0;
int auxMaior = 0;
int[] NumInteiros = new int[10];

	for (int i = 0; i < 10; i++) {
		System.out.print("Digite um numero qualquer : ");
		NumInteiros[i] = scanner.nextInt(); 
		    
		if (i == 0) {
		  auxMaior = NumInteiros[i];
		  auxMenor = NumInteiros[i];
		} 
		else {
		   if (NumInteiros[i] > auxMaior) {
		     auxMaior = NumInteiros[i];
		   }
		   if (NumInteiros[i] < auxMenor) {
		     auxMenor = NumInteiros[i];
		   }
		 }
 }
   System.out.println("O maior numero é: " + auxMaior);
   System.out.println("O Menor numero é: " + auxMenor);
  }
}



