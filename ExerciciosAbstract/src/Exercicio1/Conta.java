package Exercicio1;
//1) Crie uma classe abstrata chamada Conta com as propriedades Saldo e Limite. Crie também métodos abstratos para Depositar e Sacar.

abstract class Conta {
    protected double saldo;
    protected double limite;

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

    public abstract void depositar(double valor);

    public abstract void sacar(double valor);
}
