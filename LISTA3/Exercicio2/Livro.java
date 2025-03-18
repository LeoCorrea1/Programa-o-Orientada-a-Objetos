package Lista3.Exercicio2;

//2) Crie uma classe chamada Livro que contenha os atributos Título, Autor, Ano de publicação, Gênero e Emprestado (bool).
//Crie método que retorne as informações do livro. Crie também um método responsável por fazer o
//empréstimo do livro e outro para fazer a devolução. Faça o controle disto utilizando o atributo Emprestado.

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    String genero;
    Boolean emprestado = false;

    public void LivroInfo(String titulo, String autor, int anoPublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        System.out.println("Informações do Livro: ");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Gênero: " + genero);
    }

    public boolean emprestimo(){
        return emprestado = true;
    }
    public boolean devolucao(){
        return emprestado = false;
    }

}
