package Exerccio1.EX1;

import Exerccio1.QUADRO.pessoa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Aluno a = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        a.setNome(sc.nextLine());
        System.out.println("Digite o nota 1 do aluno: ");
        a.setNota1(sc.nextDouble());
        System.out.println("Digite o nota 2 do aluno: ");
        a.setNota2(sc.nextDouble());

        System.out.println("nome :" + a.getNome() );
        System.out.println("media : " +a.calcularMedia());

        sc.close();
    }

}

