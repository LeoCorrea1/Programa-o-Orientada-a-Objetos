package EX3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o nome do funcionario: ");
        funcionario.setNome( sc.nextLine());
        System.out.println("Digite o salario do funcionario: ");
        double salario = sc.nextDouble();
        System.out.println("O salario Anual do Funcionario " + funcionario.getNome() + " é de : " + funcionario.CalcularSalario(salario));

        Gerente gerente = new Gerente();

        System.out.println("\nDigite o nome do gerente : ");
        gerente.setNome( sc.nextLine());
        sc.nextLine();
        System.out.println("Digite o salario do gerente : ");
        double salarioG = sc.nextDouble();
        System.out.println("Digite o bonus do gerente em % : ");
        double bonusG = sc.nextDouble();

        System.out.println("O salario Anual do Gerente " + gerente.getNome() + " é de : " + gerente.CalcularSalario(salario, bonusG ));

    }
}
