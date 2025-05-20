package Exercicio5;
//5) Crie uma classe abstrata chamada Pessoa com aos atributos Nome e Cidade. Crie também um método
// abstrato chamado EfetuarCompra. Crie duas classes que herdam de Pessoa, uma chamada PessoaFIsica e outra chamada PessoaJuridica, que
// implementam o método EfetuarCompra. Crie atributos específicos para cada uma das novas classes, por exemplo,
//  CPF em PessoaFisica e CNPJ em PessoaJuridica.

abstract class Pessoa {
    private String nome;
    private String cidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    abstract void efetuarCompra();
}
