package Exercicio2GPT;

import java.util.Scanner;

public class Produto {
	
	public String Nome ;
	public float preço = 0;
	public int quantidade ;
	
	public void adicionarEstoque() {
		
		Scanner scanner = new Scanner(System.in);;
		
		System.out.println("Quantidade que deseja adicionar ? ");
		 int valor = scanner.nextInt(); 
		 this.quantidade += valor;
		 System.out.println("adicionado com sucesso ! ");
		 
	}
	public void removerEstoque() {
		
		Scanner scanner = new Scanner(System.in);;
		
		System.out.println("Quantos deseja remover? ");
		 int valor = scanner.nextInt();
		 
		 if(quantidade>valor) {
			 this.quantidade -= valor;
			 System.out.println("removido com sucesso ! ");
			 
		 }else
			 System.out.println("Voce nao tem tudo isso");
	}
	public void exibirDetalhes() {

		
		System.out.printf("📦 Produto: %s | 💲 Preço: R$%.2f | 📊 Quantidade: %d\n", Nome, preço, quantidade);
	
	}
	
	
 public static void main(String[] args) {
	 
	 Scanner scanner = new Scanner(System.in);;
	 Produto p = new Produto();
	
	 int opcao = 0;
	 
	 System.out.println("Digite o nome do produto que deseja adicionar : ");
	 p.Nome = scanner.nextLine(); 
	 System.out.println("Digite o preço do produto : ");
	 p.preço = scanner.nextFloat(); 
	 System.out.println("Digite a quantidade inicial : ");
	 p.quantidade = scanner.nextInt(); 
	
	 do {
	 System.out.println("\n---- Menu do estoque ----");
	 System.out.println("Para adicionar no estoque digite 1");
	 System.out.println("Para remover do estoque digite 2");
	 System.out.println("Para Exibir detalhes do estoque digite 3");
	 System.out.println("Para sair digite 0");
	 opcao = scanner.nextInt();
	 
	 
	 switch(opcao) {
	 	case 1 :
	 		p.adicionarEstoque();
	 		break;
	 	case 2 :
	 		p.removerEstoque();
	 		break;
	 	case 3:
	 		p.exibirDetalhes();
	 		break;
	  }
	 } while (opcao != 0);	
	 
	scanner.close();
	}
}


