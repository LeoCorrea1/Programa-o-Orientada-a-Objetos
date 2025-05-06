package EX5;

public class Produto {
    public String nome;
    private double precoAtual;

    public double getPrecoAtual() {
        return precoAtual;
    }

    public void setPrecoAtual(double precoAtual) {
        this.precoAtual = precoAtual;
    }

    public double calcularPrecoFinal(double preco) {
        return getPrecoAtual() + preco;
    }

    public double calcularPrecoFinal(Cliente cliente) {
        return getPrecoAtual()  * (cliente.getDesconto()/100);
    }
}
