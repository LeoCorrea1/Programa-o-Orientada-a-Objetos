package Exercicio4;
//5) Crie uma classe abstrata chamada Veiculo com as propriedades Marca, Modelo e Ano. Crie dois métodos abstratos
// chamados Acelerar e Frear. Crie duas classes que herdam de Veiculo, uma chamada Carro e outra chamada Moto,
// que implementam os métodos Acelerar e Frear.


abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    abstract void acelerar();

    abstract void frear();
}
