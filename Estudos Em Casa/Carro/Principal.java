package Aula18_03.Carro;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.println("DIGITE UMA MARCA DE CARRO : ");
    String Ma = scanner.nextLine();
    System.out.println("DIGITE UM MODELO DE CARRO : ");
    String Mo = scanner.nextLine();

    Carro c = new Carro(Mo, Ma);
    Carro c2 = new Carro(Mo, Ma);
   

    System.out.println("CARRO 1");
    c.exibirDados();
    
    System.out.println("CARRO 2");
    c2.marca = "renan";
    c2.modelo = "Sandero rs";

    c2.exibirDados();
     
    System.out.println("CARRO 3");
    Carro c3 = new Carro();
    c3.marca = "VW";
    c3.modelo = "Gol";
    
    c3.exibirDados();

    System.out.println("Voce deseja alugar os carros ? (sim -1 ou nao -2)");
    int opcao = scanner.nextInt();

    if(opcao == 1){
        c.Alugar();
    }
    else
        c.Devolver();
    
    


    scanner.close();
 }
}