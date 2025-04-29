package polimorfismo.exemplo1;

public class Cachorro extends Animal {
    public String raca;

    @Override
    public void emitirSom() {
        System.out.println("Som de cachorro");
    }
}
