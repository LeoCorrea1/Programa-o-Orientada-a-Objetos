package EX8;

import java.util.Scanner;

public class EX8 {
		
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int SomaPar  = 0;
int SomaImpar  = 0;
int[] NumInteiros = new int[10];

for (int i = 0; i < 10; i++) {
	System.out.print("Digite um numero qualquer : ");
	NumInteiros[i] = scanner.nextInt(); 

	if (NumInteiros[i] %2 == 0 ) {
		SomaPar  ++;
		
	}else {
		SomaImpar  ++;
}
}
 System.out.println("Quantidade de numeros impares: " + SomaImpar);
 System.out.println("Quantidade de numeros pares: " + SomaPar);
} 
}




	

