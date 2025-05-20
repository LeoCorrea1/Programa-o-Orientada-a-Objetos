package CODG3;

public class Cachorro implements Animal {
    public String nome;
    public String raca;


    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }
    public void cuidarPatio() {
        System.out.println("Cachorro cuidando do pátio");
    }
    public void exibeDados() {
        System.out.println("nome : " + nome);
        System.out.println("raça : " + raca);
    }

}
