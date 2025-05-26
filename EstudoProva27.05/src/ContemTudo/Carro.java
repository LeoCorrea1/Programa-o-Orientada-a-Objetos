package ContemTudo;

// ======= polimorfismo / ListaExercicios =======
public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    // Sobrescrita de métodos
    @Override
    public void ligar() { System.out.println("Carro ligado."); }
    @Override
    public void desligar() { System.out.println("Carro desligado."); }
    @Override
    public void acelerar() { System.out.println("Carro acelerando."); }
    @Override
    public void frear() { System.out.println("Carro freando."); }

    @Override
    public String toString() {
        return super.toString() + " - Portas: " + portas;
    }
}
