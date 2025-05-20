package CODG3;

public class Gato implements Animal{

    public String nome;
    public String raca;
    public String cor;

    public void emitirSom() {
        System.out.println("Miau");
    }
    public void exibeDados() {
        System.out.println("nome : " + nome);
        System.out.println("raça : " + raca);
        System.out.println("cor : " + cor);
    }
}
