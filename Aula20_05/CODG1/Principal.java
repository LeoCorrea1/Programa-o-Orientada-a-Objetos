package CODG1;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.especie = "Cachorro";
        cachorro.idade = 5;
        cachorro.raca = "Labrador";
        cachorro.exibirInfoAnimal();
        cachorro.emitirSom();
        cachorro.cuidarPatio();

    }
}
