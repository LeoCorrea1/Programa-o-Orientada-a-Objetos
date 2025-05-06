package EX1;

public class Computador {
    protected String marca;
    private String modelo = "Portátil";

    public String ExibeModelo() {
        return getModelo();
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
