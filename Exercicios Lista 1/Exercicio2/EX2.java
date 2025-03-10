package Exercicio2;

import java.util.Scanner;

public class EX2 {
	
  public static void main(String[] args) {
	  
	Scanner scanner = new Scanner(System.in);
	
	int KmInicial , KmFinal ;
	double litrosGastos , valorRecebido , totalQuilometragem , mediaConsumo, lucroDia;
	        
	
	System.out.print("Digite a marcação do odômetro no início do dia: ");
	 KmInicial = scanner.nextInt();
	        
	System.out.print("Digite a marcação do odômetro no final do dia: ");
	 KmFinal = scanner.nextInt();
	
	System.out.print("Digite a quantidade de litros de combustível gasto: ");
	 litrosGastos = scanner.nextDouble();
	        
	System.out.print("Digite o valor total recebido dos passageiros: ");
	 valorRecebido = scanner.nextDouble();
	        
	      
	 totalQuilometragem = KmFinal - KmInicial;
	 mediaConsumo = totalQuilometragem / litrosGastos;
	 lucroDia = valorRecebido - (litrosGastos * 4.90);
	        
	System.out.println("Total de quilômetros percorridos: " + totalQuilometragem + " km");
	System.out.println("Média de consumo: " + mediaConsumo + " km/l");
	System.out.println("Lucro líquido do dia: R$ " + lucroDia);
	        
	}
}




