package Exercicio3;
//3) Crie uma classe chamada Animal com os atributos privadas Nome e Idade. Também deve possuir os métodos get e set
// para encapsulamento. Crie também um
// método abstrato chamado EmitirSom. Crie duas classes que herdam de Animal, uma chamada Cachorro e outra chamada Gato,
//  que implementam o método EmitirSom.

abstract class Animal {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    void emitirSom() {

    }
}
