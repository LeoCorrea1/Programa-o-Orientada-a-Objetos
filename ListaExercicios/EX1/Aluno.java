package ListaExercicios.EX1;


import java.util.ArrayList;
import java.util.List;


public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {

        return (nota1 + nota2) / 2;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                '}';
    }

    public static void main(String[] args) {
        Boletim boletim = new Boletim();
        List<Aluno> alunos = new ArrayList<Aluno>();

        alunos.add(new Aluno("Aluno1", 3.5, 9.5));
        alunos.add(new Aluno("Aluno2", 4.5, 7.5));
        alunos.add(new Aluno("Aluno3", 9.5, 4.5));
        alunos.add(new Aluno("Aluno4", 6.5, 7.5));

        for(Aluno aluno : alunos) {
            System.out.println(aluno);
        }






        }
    }

