package polimorfismo.exemplo3;

public class sobrecargaExemplo {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultado1 = calculadora.somar(10, 20);
        int resultado2 = calculadora.somar(10, 20 , 40);
        System.out.println("resultado 1 : " + resultado1);
        System.out.println("resultado 2 : " + resultado2);
        
        double resultado3 = calculadora.somar(3.5, 7);
        System.out.println("resultado 3 : " + resultado3);
        double resultado4 = calculadora.somar(4.5 , 5.3);
        System.out.println("resultado 4 : " + resultado4);
    }
}
