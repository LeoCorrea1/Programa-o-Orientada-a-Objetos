package Aula18_03.Calculadoraaa;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE 1 NUMERO");
        calc.n1 = scanner.nextDouble();
        System.out.println("DIGITE OUTRO NUMERO");
        calc.n2 = scanner.nextDouble();

        System.out.println("RESULTADO DA SOMA  : "+calc.somar());
        calc.Subtrair(calc.n1 , calc.n2);
        calc.Dividir(calc.n1 , calc.n2);
        System.out.println("\nRESULTADO DA MULTIPLICAÇAO : "+calc.Multiplicar());
        

        scanner.close();
    }
}
