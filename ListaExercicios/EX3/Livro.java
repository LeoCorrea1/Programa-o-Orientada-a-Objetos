package ListaExercicios.EX3;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void exibir() {
        System.out.println("Título: " + getTitulo() + ", Autor: " + getAutor());
    }

    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();
        Livro l = new Livro("diario de um banana", "bananinha");
        livros.add(l);
        livros.add(new Livro("2002", "leonardo dicaprio"));
        livros.add(new Livro("Dom Quixote", "quixote"));
        livros.add(new Livro("Bichanos", "um gato"));

        for( Livro livro : livros) {
            livro.exibir();
        }

    }
}
