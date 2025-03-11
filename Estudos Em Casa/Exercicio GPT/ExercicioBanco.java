package ExercicioGPT;

import java.util.Scanner;

public class banco {
	
	 public void dizerOla() {
	        System.out.println("Olá, Bem vindo ao banco Java !");
	    }
public static class ContaBancaria {
	
	private String Titular;
	private double Saldo;
	
	public void depositar() {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Quantia que deseja Depositar : ");
        int valor = scanner.nextInt(); 
        System.out.println("Deposito de "+valor +" realizado");
        Saldo += valor;
    }
public void Sacar() {
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Quantia que deseja Sacar : ");
        int valor = scanner.nextInt(); 
        System.out.println("Saque de "+valor +" realizado");
        
        if(Saldo>=valor) {
        	Saldo -= valor;
		
        }else
        	System.out.println("Nao foi possivel Sacar , Saldo Insuficiente");  
       
    }
 public void ExibirSaldo() {
	 
	
     System.out.println("O Saldo Atual do titular " +this.Titular + " é : "+this.Saldo);
	 
}
	}

public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	int opcao = 0;

	ContaBancaria cb = new ContaBancaria();
	banco b = new banco();
	
	System.out.println("Criando conta para : ");
	cb.Titular = scanner.nextLine();
	
	do {
	    System.out.println("\n---- Menu do banco ---- ");
	    System.out.println("Para depositar digite 1");
	    System.out.println("Para sacar digite 2");
	    System.out.println("Para Exibir saldo digite 3");
	    System.out.println("Para sair digite 0");
	    opcao = scanner.nextInt();

	    switch (opcao) {
	        case 1:
	            cb.depositar();
	            break;
	        case 2:
	            cb.Sacar();
	            break;
	        case 3:
	            cb.ExibirSaldo();
	            break;
	        case 0:
	            System.out.println("Saindo... Obrigado por usar o Banco Java!");
	            break;
	        default:
	            System.out.println("Opção inválida, tente novamente.");
	    }
	} while (opcao != 0);
}

}



	 

