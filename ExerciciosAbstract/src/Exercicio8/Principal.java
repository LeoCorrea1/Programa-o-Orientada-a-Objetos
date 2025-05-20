package Exercicio8;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BancoDeDados bd = new BancoDeDados();

        System.out.println("Deseja se conectar ao banco de dados? (s/n) : ");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            bd.conectar();
        } else {
            System.out.println("Conexão não realizada.");
        }

        System.out.println("Dado a ser inserido : ");
        bd.inserir(sc.nextLine());


        System.out.println("digite o dado Atualizado para atualizar o dado (" + bd.getDados() + ") : ");
        bd.atualizar(sc.nextLine());


        System.out.println("Deseja desconectar do banco de dados? (s/n)");
        String resposta2 = sc.nextLine();
        if (resposta2.equalsIgnoreCase("s")) {
            bd.desconectar();
        } else {
            System.out.println("Ainda Logado no banco de dados.");
        }

        System.out.println("situação do banco de dados: " + bd.getStatusConexao());


    }
}
