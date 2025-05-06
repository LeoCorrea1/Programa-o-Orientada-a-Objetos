package EX2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        ProdutoComDesconto p = new ProdutoComDesconto();
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O PREÇO DO PRODUTO SEM DESCONTO :");
        double Preco = sc.nextDouble();
        System.out.println("DIGITE O VALOR DO DESCONTO :");
        double valorDesconto = sc.nextDouble();

        System.out.println("VALOR DO PRODUTO COM DESCONTO : ");
        p.Desconto(Preco,valorDesconto);

    }
}
