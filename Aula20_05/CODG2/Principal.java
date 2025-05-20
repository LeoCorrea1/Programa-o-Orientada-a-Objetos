package CODG2;

public class Principal {
    public static void main(String[] args) {
        Forma retangulo = new Retangulo(5, 2);

        System.out.println("Área do retângulo: " + retangulo.area());
        System.out.println("Perímetro do retângulo: " + retangulo.perimetro());

        System.out.println("\n");

        Forma circulo = new Circulo(3);
        System.out.printf("Área do círculo: %.2f\n", circulo.area());
        System.out.printf("Perímetro do círculo: %.2f", circulo.perimetro());

    }
}
