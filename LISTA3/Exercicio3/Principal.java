package Lista3.Exercicio3;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[2];

        for (int i = 0; i < 2; i++) {
            pessoas[i] = new Pessoa();
            System.out.println("Digite o nome da pessoa " +(i+1)+" : " );
            pessoas[i].nome = scanner.nextLine();
            System.out.println("Digite o email da pessoa " +(i+1)+" : ");
            pessoas[i].email = scanner.nextLine();
            System.out.println("Digite o endereco da pessoa " +(i+1)+" : ");
            pessoas[i].endereco = scanner.nextLine();
            System.out.println("Digite o telefone da pessoa " +(i+1)+" : ");
            pessoas[i].telefone = scanner.nextInt();
            System.out.println("Digite a data de nascimento da pessoa " +(i+1)+" : ");
            pessoas[i].dataNascimento = scanner.nextInt();
            System.out.println("A pessoa " +(i+1) +" é admin? (true/false): ");
            pessoas[i].admin = scanner.nextBoolean();
            scanner.nextLine();
        }
        if (pessoas[0].admin) {
            System.out.printf("\n%s já é admin.\n", pessoas[0].nome);
            pessoas[1].admin = false; // Garante que a segunda pessoa não seja admin
        } else {
            System.out.printf("\n%s será promovido a admin.\n", pessoas[1].nome);
            pessoas[1].promoverAdmin();
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("\n\nDados da pessoa " + (i+1) + ":");
            System.out.println("Nome "+(i+1)+" : " + pessoas[i].nome);
            System.out.println("Email "+(i+1)+" : "  + pessoas[i].RetornaEmail());
            System.out.println("Endereco "+(i+1)+" : "  + pessoas[i].endereco);
            System.out.println("Telefone "+(i+1)+" : "  + pessoas[i].telefone);
            System.out.println("Data de Nascimento "+(i+1)+" : "  + pessoas[i].dataNascimento);
            System.out.println("Admin "+(i+1)+" : "  + pessoas[i].admin);
        }
    }
}
