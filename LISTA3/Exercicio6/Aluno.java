package Lista3.Exercicio6;
//Criar uma classe chamada Aluno com 3 construtores, sendo que o primeiro recebe o nome e a matrícula do aluno,
//o segundo recebe apenas a data de nascimento do aluno e o terceiro construtor recebe o nome do aluno,
//a data de nascimento e o ano em que o aluno ingressou na faculdade.
//Crie uma classe principal, com 3 objetos, cada um instanciando a classe com um construtor diferente.

import java.util.Scanner;

public class Aluno {
    String nome;
    String matricula;
    String dataNascimento;
    int anoIngresso;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Aluno(String nome, String dataNascimento, int anoIngresso) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoIngresso = anoIngresso;
    }

    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---- MENU ----");
            System.out.println("1 - Nome e matrícula");
            System.out.println("2 - Data de nascimento");
            System.out.println("3 - Nome, data de nascimento e ano de ingresso");
            System.out.println("4 - Sair");
            System.out.print("Escolha a opcao: ");
            opcao = sc.nextInt();

            sc.nextLine();

            String nome, matricula, dataNascimento;
            int anoIngresso;

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    nome = sc.nextLine();
                    System.out.print("Digite a matrícula: ");
                    matricula = sc.nextLine();
                    Aluno aluno1 = new Aluno(nome, matricula);
                    System.out.println("Aluno 1: " + aluno1.nome + ", Matrícula: " + aluno1.matricula);
                    break;

                case 2:
                    System.out.print("Digite a data de nascimento: ");
                    dataNascimento = sc.nextLine();
                    Aluno aluno2 = new Aluno(dataNascimento);
                    System.out.println("Aluno 2: Data de Nascimento: " + aluno2.dataNascimento);
                    break;

                case 3:
                    System.out.print("Digite o nome: ");
                    nome = sc.nextLine();
                    System.out.print("Digite a data de nascimento: ");
                    dataNascimento = sc.nextLine();
                    System.out.print("Digite o ano de ingresso: ");
                    anoIngresso = sc.nextInt();
                    Aluno aluno3 = new Aluno(nome, dataNascimento, anoIngresso);
                    System.out.println("Aluno 3: Nome: " + aluno3.nome + ", Data de Nascimento: " + aluno3.dataNascimento + ", Ano de Ingresso: " + aluno3.anoIngresso);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        sc.close();
    }
}