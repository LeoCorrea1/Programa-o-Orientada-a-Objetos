package Exercicio3;

public class Principal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        System.out.println("Som do cachorro:");
        cachorro.emitirSom();
        System.out.println("Som do gato:");
        gato.emitirSom();
    }
}
