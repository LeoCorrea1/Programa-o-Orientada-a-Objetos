package Exercicio3GPT;

import java.util.Scanner;

public class Funcionarios {

    public String nome;
    public String cargo;
    public int salario;

    public static void ReajustarSalario(Funcionarios[] f) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < f.length; i++) {
            System.out.println("Deseja mudar o salário do funcionário " + (i + 1) + " para quanto?");
            int mudançaS = scanner.nextInt();
            f[i].salario = mudançaS;
        }
    }

    public static void MediaSalarial(Funcionarios[] f) {
        int soma = 0;
        for (int i = 0; i < f.length; i++) {
            soma += f[i].salario;  // Soma todos os salários
        }
        int media = soma / f.length;  // Calcula a média
        System.out.println("\nMedia salarial dos funcionários: R$" + media);
    }

    public void ExibirFuncionarios() {
        System.out.println(nome + " | Cargo: " + cargo + " | Salário: R$" + salario);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos funcionários deseja cadastrar?");
        int quantia = scanner.nextInt();
        scanner.nextLine(); // Consumir o '\n' após nextInt()
        Funcionarios[] f = new Funcionarios[quantia];

        for (int i = 0; i < quantia; i++) {
            f[i] = new Funcionarios(); // Criando um novo objeto para cada funcionário
            System.out.print("\nDigite o nome do funcionário " + (i + 1) + " : ");
            f[i].nome = scanner.nextLine();
        }

        for (int j = 0; j < quantia; j++) {
            System.out.print("\nDigite o cargo do funcionário " + (j + 1) + " : ");
            f[j].cargo = scanner.nextLine();
        }

        for (int k = 0; k < quantia; k++) {
            System.out.print("\nDigite o salário do funcionário " + (k + 1) + " : ");
            f[k].salario = scanner.nextInt();
            scanner.nextLine(); // Consumir o '\n' após nextInt()
        }

        // Exibir informações dos funcionários
        System.out.println("\n📋 Lista de funcionários cadastrados:");
        for (int y = 0; y < quantia; y++) {
            f[y].ExibirFuncionarios();
        }

        // Pergunta para reajustar salários
        System.out.println("\nDeseja fazer alteração no salário geral? (sim ou nao)");
        String opcao = scanner.nextLine().toLowerCase();

        if (opcao.equals("sim")) {
            ReajustarSalario(f);
            System.out.println("\n📋 Lista de funcionários cadastrados atualizada:");
            for (int y = 0; y < quantia; y++) {
                f[y].ExibirFuncionarios();
            }
        }

        MediaSalarial(f);

        scanner.close();
    }
}
