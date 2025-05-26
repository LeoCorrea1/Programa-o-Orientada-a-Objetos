package ContemTudo;

// ======= polimorfismo / ListaExercicios =======
public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void ligar() { System.out.println("Moto ligada."); }
    @Override
    public void desligar() { System.out.println("Moto desligada."); }
    @Override
    public void acelerar() { System.out.println("Moto acelerando."); }
    @Override
    public void frear() { System.out.println("Moto freando."); }

    @Override
    public String toString() {
        return super.toString() + " - Cilindradas: " + cilindradas + "cc";
    }
}
