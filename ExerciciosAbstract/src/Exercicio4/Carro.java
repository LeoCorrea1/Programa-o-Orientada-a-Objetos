package Exercicio4;

public class Carro extends Veiculo {

    @Override
    void acelerar() {
        System.out.println("O carro : " + getModelo() + " do ano " + getAno() + " da marca " + getMarca() + " acelerou");

    }

    @Override
    void frear() {
        System.out.println("O carro : " + getModelo() + " do ano " + getAno() + " da marca " + getMarca() + " freiou");


    }
}
