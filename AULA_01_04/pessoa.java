package Exerccio1;

public class pessoa {

    private String nome;
    private int idade;
    public String cpf;

    public pessoa(String nome, int idade , String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    public void ApresentaDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }

    public String getNome() {
        return nome;
    }

    public String CPF() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public int getIdade() {

        return idade;
    }

    public String getCpf() {

        return cpf;
    }

    public void setIdade(int idade) {

        if(idade < 0){
            System.out.println("Idade negativa");
        }
        else {
            this.idade = idade;
            System.out.println("Idade: " + idade);
        }
    }

}
