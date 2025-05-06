package EX5;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Digite o nome do produto: ");
        produto.nome = sc.nextLine();
        System.out.println("Digite o preço do produto atual :");
        produto.setPrecoAtual(sc.nextDouble());

        System.out.println("Digite o valor a ser adicionado no valor final do produto :");
        System.out.println("VALOR FINAL DA " +produto.nome +" É DE : " +produto.calcularPrecoFinal(sc.nextDouble()));

        Cliente cliente = new Cliente();
        System.out.println("Digite o nome do cliente: ");
        cliente.nome = sc.nextLine();
        sc.nextLine();
        System.out.println("Digite a quantidade de desconto que o cliente tem em % :");
        cliente.setDesconto(sc.nextDouble());
        System.out.println("valor final do cliente : " + cliente.nome + " é de : ");
        produto.calcularPrecoFinal(cliente);




    }
}
