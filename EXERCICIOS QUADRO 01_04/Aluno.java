package Exerccio1.EX1;

public class Aluno {

    private String nome;
    private Double nota1;
    private Double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
}