package polimorfismo.exemplo4;


public class Principal {
    public static void main(String[] args) {
        Multiplicar m = new Multiplicar();
        int resultado1 = m.multiplica(10, 20);
        int resultado2 = m.multiplica(10, 20 , 40);
        System.out.println("resultado 1 : " + resultado1);
        System.out.println("resultado 2 : " + resultado2);

        double resultado3 = m.multiplica(3.5, 7);
        System.out.println("resultado 3 : " + resultado3);
        double resultado4 = m.multiplica(4.5 , 5);
        System.out.println("resultado 4 : " + resultado4);
    }
}
