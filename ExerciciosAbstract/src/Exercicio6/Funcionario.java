package Exercicio6;
//6) Crie uma classe abstrata chamada Funcionario com os atributos Nome e Salário. Crie também um método abstrato chamado CalcularSalario.
// Crie duas classes que herdam de Funcionario, uma chamada Gerente e outra chamada Vendedor, que implementam o método CalcularSalario.

abstract class Funcionario {
    public String nome;
    public double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    void calcularSalario() {
    }

}
