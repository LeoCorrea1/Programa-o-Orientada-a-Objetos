package EX9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public static void main(String[] args) {

            List<Produto> listaDeProdutos = new ArrayList<>();


            Produto produto1 = new Produto("produto 1 ", 25.99, 50);
            Produto produto2 = new Produto("produto 2", 79.90, 30);
            Produto produto3 = new Produto("produto 3", 120.50, 20);

            listaDeProdutos.add(produto1);
            listaDeProdutos.add(produto2);
            listaDeProdutos.add(produto3);

            System.out.println("Lista de Produtos:");
            for (Produto produto : listaDeProdutos) {
                System.out.println(produto.toString());
            }
        }
    }

