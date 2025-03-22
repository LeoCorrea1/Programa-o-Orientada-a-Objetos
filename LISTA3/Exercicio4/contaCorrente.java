import java.util.Scanner;

public class contaCorrente {
    Float saldo;

    public void definirSaldoInicial(float valor) {
        this.saldo = valor;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean sacar(float valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void imprimirSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }

    public static void main(String[] args) {
        contaCorrente novaConta = new contaCorrente();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saldo inicial: ");
        float valor = sc.nextFloat();
        novaConta.definirSaldoInicial(valor);
        System.out.println("Valor do saldo inicial: " + novaConta.saldo);

        int opcao;
        do {
            System.out.println("---- MENU DO BANCO ----");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Imprimir saldo");
            System.out.println("4 - Sair");
            System.out.println("Digite a opcao desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do saque: ");
                    float valorSaque = sc.nextFloat();
                    if (novaConta.sacar(valorSaque) == false) {
                        System.out.println("nao é possivbel , saldo insuficiente.");
                    }
                    break;
                case 2:
                    System.out.println("Digite o valor do deposito: ");
                    float valorDeposito = sc.nextFloat();
                    novaConta.depositar(valorDeposito);
                    novaConta.imprimirSaldo();
                    break;
                case 3:
                    novaConta.imprimirSaldo();
                    break;
                case 4:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        }
    }

