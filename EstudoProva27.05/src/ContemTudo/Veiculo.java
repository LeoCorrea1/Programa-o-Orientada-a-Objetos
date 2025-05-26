package ContemTudo;

// ======= ExerciciosAbstract / LISTA3 =======
public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos abstratos (ABSTRAÇÃO)
    public abstract void ligar();
    public abstract void desligar();
    public abstract void acelerar();
    public abstract void frear();

    @Override
    public String toString() {
        return "Veiculo: " + marca + " " + modelo + " (" + ano + ")";
    }
}
