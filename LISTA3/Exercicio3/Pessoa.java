package Lista3.Exercicio3;

public class Pessoa {
    String nome;
    String email;
    String endereco;
    int telefone;
    int dataNascimento;
    boolean admin;

    public String RetornaEmail() {
        return this.email;
    }
    public void promoverAdmin() {
        this.admin = true;
    }
}
