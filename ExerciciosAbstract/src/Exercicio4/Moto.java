package Exercicio4;

public class Moto extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("A moto : " + getModelo() + " do ano " + getAno() + " da marca " + getMarca()+ "acelerou");

    }

    @Override
    void frear() {
        System.out.println("A moto : " + getModelo() + " do ano " + getAno() + " da marca " + getMarca() + "freiou");


    }
}
