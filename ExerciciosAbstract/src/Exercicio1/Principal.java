package Exercicio1;

public class Principal extends Conta{
    @Override
    public void depositar(double valor) {
        this.saldo = getSaldo() + valor;
        System.out.println("Deposito de " + valor + " realizado com sucesso.");

    }

    @Override
    public void sacar(double valor) {

        System.out.println("Saque de " + valor + " realizado com sucesso.");
        this.saldo = getSaldo() - valor;

    }

    public static void main(String[] args) {
        Conta conta = new Principal();
        conta.setSaldo(500);
        conta.setLimite(1000);

        conta.depositar(1000);
        conta.sacar(420);

        System.out.println("Saldo: " + conta.getSaldo());


    }
}
