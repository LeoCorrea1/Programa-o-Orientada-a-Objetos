package Exercicio5;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    void efetuarCompra() {
        System.out.println("A pessoa fisica " + getNome() + " da cidade " + getCidade() + " efetuou uma compra.");
    }
}
