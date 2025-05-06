package EX4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Digite o valor do saldo Atual: ");
        conta.setSaldo(sc.nextDouble());

        System.out.println("Digite o valor a ser depositado: ");
        conta.Depositar(sc.nextDouble());

        System.out.println("Digite o valor do cheque : ");
        Cheque cheque = new Cheque(sc.nextDouble());
        conta.Depositar(cheque);
    }
}
