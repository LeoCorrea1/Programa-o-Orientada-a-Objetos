package Lista3.Exercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.titulo = "Programaçao orienteada a objetos";
        livro.autor = "Ricardo ";
        livro.anoPublicacao = 2018;
        livro.genero = "Programação";

        livro.LivroInfo(livro.titulo, livro.autor, livro.anoPublicacao, livro.genero);
        System.out.println("\nVoce deseja Pegar emprestado o livro ? (sim -1 ou nao -2)");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        if(opcao == 1){
            if(livro.emprestado == false){
                livro.emprestado = true;
                System.out.println("\nLivro emprestado com sucesso!");
            }
            else{
                System.out.println("\nLivro já emprestado!");
            }
        }
        System.out.println("SITUAÇÃO DO LIVRO: " + livro.emprestado);

        scanner.close();
    }

}