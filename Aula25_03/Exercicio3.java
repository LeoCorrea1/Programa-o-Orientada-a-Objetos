package Lista4.Exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VlorLido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = 0;

        try {
            System.out.print("Digite um número: ");
            valor = sc.nextDouble();
            System.out.println("Número convertido: " + valor);

        } catch (NumberFormatException e) {
            System.out.println("Erro: " +e.toString());
        }
        catch (InputMismatchException e) {
            System.out.println("Erro: " +e.toString());
        }

        sc.close();
    }
}
