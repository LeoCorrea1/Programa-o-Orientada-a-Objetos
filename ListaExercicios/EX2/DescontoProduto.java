package ListaExercicios.EX2;

import java.util.ArrayList;

public class DescontoProduto extends Produto {

    public DescontoProduto(String nome, double preco) {
        super(nome, preco * 0.9);
    }

     public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto p = new DescontoProduto("Maça", 10.0);
        produtos.add(p);
        produtos.add(new DescontoProduto("pera", 15.0));
        produtos.add(new DescontoProduto("banana", 60.0));
        produtos.add(new DescontoProduto("copo", 50.0));

         for (Produto produto : produtos) {
             produto.exibir();
         }
    }
}
