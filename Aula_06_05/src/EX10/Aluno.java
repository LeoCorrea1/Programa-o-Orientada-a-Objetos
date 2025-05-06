package EX10;

import EX9.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
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

        List<Aluno> alunos = new ArrayList<Aluno>();


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite a nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2 = sc.nextDouble();
        Aluno aluno = new Aluno(nome, nota1, nota2);
        alunos.add(aluno);

        System.out.println("Digite o nome do aluno: ");
        sc.nextLine();
        String nomealuno2 = sc.nextLine();
        System.out.println("Digite a nota 1: ");
        double nota1aluno2 = sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2aluno2 = sc.nextDouble();
        Aluno aluno2 = new Aluno(nomealuno2, nota1aluno2, nota2aluno2);
        alunos.add(aluno2);


        System.out.println("Lista de Alunos :");
        for (Aluno i : alunos) {
            System.out.println(i.toString());
        }
    }
}
