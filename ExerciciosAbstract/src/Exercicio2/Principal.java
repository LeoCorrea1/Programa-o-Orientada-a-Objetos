package Exercicio2;

public class Principal implements Conta {

    private double saldo;
    private double limite;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    public static void main(String[] args) {
        Principal conta = new Principal();
        conta.setSaldo(500);
        conta.setLimite(1000);

        conta.depositar(1000);
        conta.sacar(420);

        System.out.println("Saldo Atual: " + conta.getSaldo());
    }
}