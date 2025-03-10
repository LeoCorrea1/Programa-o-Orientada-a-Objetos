package EX6;

import java.util.Scanner;


public class ex6 {

public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
		        
		      
	String[] cidades = new String[5];
	int[] populaçao = new int[5];
	int auxPop = 0;
	String auxCidade = null;

	for (int i = 0; i < 5; i++) {
		System.out.print("Digite uma cidade : ");
		cidades[i] = scanner.nextLine();  
	}
	for (int i = 0; i < 5; i++) {
		System.out.print("Digite A Populaçao de " + cidades[i] +" : ");
		populaçao[i] = scanner.nextInt();  
		
		if(i == 0) {
			auxPop = populaçao[i];
			auxCidade = cidades[i];
		}
		if(populaçao[i] > auxPop) {
			auxPop = populaçao[i];
			auxCidade = cidades[i];
	}
   }
	System.out.print(auxCidade +" tem a maior populaçao, com o total de " +auxPop +" habitantes");
  }
}


	
	
 




		
	