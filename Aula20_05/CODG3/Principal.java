package CODG3;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        System.out.println("Som do cachorro:");
        cachorro.nome = "blablabalb";
        cachorro.raca = "labrador";
        cachorro.emitirSom();
        cachorro.cuidarPatio();
        cachorro.exibeDados();


        System.out.println("\n");
        Gato gato = new Gato();
        gato.nome = "bfsfsflb";
        gato.raca = "asdadad";
        gato.cor = "preto";
        System.out.println("Som do gato:");
        gato.emitirSom();
        gato.exibeDados();

    }
}
