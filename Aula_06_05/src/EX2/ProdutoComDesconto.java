package EX2;

public class ProdutoComDesconto extends Produto {
    public void Desconto (Double precoAtual , Double Desconto) {
        System.out.println(precoAtual - Desconto);
    }
}
