package CODG1;

public class Cachorro extends Animal {

    public String raca;

    @Override
    void exibirInfoAnimal() {
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade);
        System.out.println("Raça: " + raca);
    }
    @Override
    void emitirSom() {
        System.out.println("Au Au");
    }

    void cuidarPatio() {
        System.out.println("Cachorro cuidando do pátio");

    }

}
