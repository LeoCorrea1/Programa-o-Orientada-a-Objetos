package Exercicio5;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("João");
        pessoaFisica.setCidade("São Paulo");
        pessoaFisica.efetuarCompra();

        Pessoa pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Empresa XYZ");
        pessoaJuridica.setCidade("Rio de Janeiro");
        pessoaJuridica.efetuarCompra();

    }
}
