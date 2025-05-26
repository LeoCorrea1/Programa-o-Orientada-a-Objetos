package ContemTudo;

// ======= ExerciciosAbstract / Interface implementada =======
public class ContaBancaria implements OperacoesFinanceiras {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado.");
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
