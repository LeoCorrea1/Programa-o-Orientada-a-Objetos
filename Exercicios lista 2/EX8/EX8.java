package EX8;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while (true) {
        	System.out.println("\nDIGITE UMA CIDADE:");
            String cidade = scanner.nextLine().trim().intern(); 

            if (cidade == "Sao Paulo" || cidade == "sao paulo" || cidade == "SAO PAULO") { 
                System.out.println("Sao Paulo não é legal, Saindo");
                scanner.close();
                break;
            }
        }
    }
}
