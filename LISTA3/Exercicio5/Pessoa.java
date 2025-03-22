package Lista3.Exercicio5;

import java.util.Scanner;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Nome: " + this.nome + ", Idade: " + this.idade);
    }

    public Pessoa(int idade) {
        this.idade = idade;
        System.out.println("Idade: " + this.idade);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o construtor : ");
        System.out.println("1 - nome e idade");
        System.out.println("2 - só idade");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o nome: ");
            String nome = sc.next();
            System.out.println("Digite a idade: ");
            int idade = sc.nextInt();
            Pessoa pessoa1 = new Pessoa(nome, idade);
        } else if (opcao == 2) {
            System.out.println("Digite a idade: ");
            int idade = sc.nextInt();
            Pessoa pessoa2 = new Pessoa(idade);
        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
