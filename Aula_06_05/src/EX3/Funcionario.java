package EX3;

public class Funcionario {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double CalcularSalario(double Salario ) {
        return Salario * 12;
    }
}
