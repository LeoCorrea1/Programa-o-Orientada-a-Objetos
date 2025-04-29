package polimorfismo.exemplo5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("\nola sem nome : ");
        p1.dizerOla();
        System.out.println("\nola com nome : ");
        p1.dizerOla(nome);

    }
}
