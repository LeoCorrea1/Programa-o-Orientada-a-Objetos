package ContemTudo;

// ======= LISTA3 / Cliente herdando de Pessoa =======
public class Cliente extends Pessoa {
    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Cliente: " + nome + " - CPF: " + cpf);
    }
}
