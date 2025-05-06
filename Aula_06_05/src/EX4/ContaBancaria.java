package EX4;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Depositar(double valor) {
        saldo += valor;
        System.out.println("Saldo atualizado: " + saldo);
    }

    public void Depositar(Cheque cheque) {
        saldo += cheque.getValor();
        System.out.println("Saldo com cheque atualizado: " + saldo);
    }
}
