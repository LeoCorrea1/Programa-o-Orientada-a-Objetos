package ListaExercicios.EX5;

import java.util.ArrayList;

public class Conta {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(Conta c , double valor) {
        c.saldo += valor;

    }

    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<Conta>();
        Conta c1 = new Conta("Lucas", 1000.0);
        contas.add(c1);
        Conta c2 = new Conta("Joao", 1000.0);
        contas.add(c2);
        Conta c3 = new Conta("Leonardo", 1000.0);
        contas.add(c3);
        Conta c4 = new Conta("Pedro", 1000.0);
        contas.add(c4);

        for (Conta conta : contas) {
            System.out.println("Titular: " + conta.getTitular() + ", Saldo: " + conta.getSaldo());
        }

        System.out.println("\n");

        System.out.println("Deposito de 1000.0 na conta de " + c1.getTitular());
        c1.depositar(c1, 1000.0);
        System.out.println("Novo saldo: " + c1.getSaldo());
        System.out.println("\n");
        System.out.println("Deposito de 440.0 na conta de " + c2.getTitular());
        c1.depositar(c2, 440.0);
        System.out.println("Novo saldo: " + c2.getSaldo());
        System.out.println("\n");
        System.out.println("Deposito de 70.0 na conta de " + c3.getTitular());
        c1.depositar(c3, 70);
        System.out.println("Novo saldo: " + c3.getSaldo());
        System.out.println("\n");

    }
}
