package EX1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 para Notebook ou 2 para Netbook:");
        int opcao = sc.nextInt();
        sc.nextLine();

        Computador comp;

        if (opcao == 1) {
            Notebook nb = new Notebook();
            System.out.print("Digite a marca: ");
            nb.setMarca(sc.nextLine());
            System.out.println("Marca :" +nb.ExibeMarca(nb.getMarca()));
            System.out.println("Modelo : " +nb.ExibeModelo());

        } else {
            Netbook nt = new Netbook();
            System.out.print("Digite a marca: ");
            nt.marca = sc.nextLine();
            System.out.println("Marca : " +nt.ExibeMarca());
            System.out.println("Modelo : " +nt.ExibeModelo());
        }

        sc.close();
    }
}