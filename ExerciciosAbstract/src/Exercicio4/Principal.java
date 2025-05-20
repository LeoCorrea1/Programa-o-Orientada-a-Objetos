package Exercicio4;

public class Principal {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setModelo("BMW");
        carro.setAno(2020);
        carro.setMarca("M5");
        carro.acelerar();
        System.out.println("\n");
        carro.frear();

        Moto moto = new Moto();
        moto.setModelo("XJ6");
        moto.setAno(2020);
        moto.setMarca("x5223");
        moto.acelerar();
        System.out.println("\n");
        moto.frear();
    }
}
