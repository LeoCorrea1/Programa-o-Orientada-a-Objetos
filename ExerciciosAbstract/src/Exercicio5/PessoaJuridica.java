package Exercicio5;

public class PessoaJuridica extends Pessoa{

    private String cnpj;



    @Override
    void efetuarCompra() {
        System.out.println("A pessoa juridica " + getNome() + " da cidade " + getCidade() + " efetuou uma compra.");

    }
}
