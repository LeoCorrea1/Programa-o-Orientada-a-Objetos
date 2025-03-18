
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
   


    Disciplina Disc = new Disciplina();
    Disciplina Disc2 = new Disciplina();
   
    Disc.NomeProfessor = "renan";
    Disc.Nome = "Programaçao";
    Disc.CargaHoraria= 80;

    System.out.println("\nCONTEUDO ORIGINAL DOS ATRIBUROS\n");
    System.out.println("Nome Disciplina : " +Disc.Nome);
    System.out.println("Nome Professor : " +Disc.NomeProfessor);
    System.out.println("Carga horaria da Disciplina : " +Disc.CargaHoraria);


    System.out.println("\nVoce deseja Atribuir ? (sim -1 ou nao -2)");
    Scanner scanner = new Scanner(System.in);
    int opcao = scanner.nextInt();


    if(opcao == 1){
        System.out.println("Digite o nome da disciplina : ");
        String nome = scanner.nextLine();
        scanner.nextLine(); 
        System.out.println("Digite A carga horaria da disciplina : ");
        int cargaHoraria = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite o nome do professor : ");
        String nomeProfessor = scanner.nextLine();
        Disc2.Atribuir(nome, nomeProfessor, cargaHoraria);
        System.out.println("\nNovo conteúdo dos atributos : ");
        System.out.println("Nome Disciplina : " +Disc2.Nome);
        System.out.println("Nome Professor : " +Disc2.NomeProfessor);
        System.out.println("Carga horaria da Disciplina : " +Disc2.CargaHoraria);
    }
    else{
        System.out.println("\nCONTEÚDO RECUPERADO\n");
        System.out.println("Nome Disciplina: " + Disc.RecuperarNome());
        System.out.println("Nome Professor: " +  Disc.RecuperarNomeProfessor());
        System.out.println("Carga Horária da Disciplina: " + Disc.RecuperarCargaHoraria());
    }

    System.out.println("\nVocê deseja recuperar os valores originais? (sim - 1 ou não - 2)");
    scanner.nextLine();
    int opcao2 = scanner.nextInt();
    
    if (opcao2 == 1) {
        System.out.println("\nCONTEÚDO RECUPERADO\n");
        System.out.println("Nome Disciplina: " + Disc.RecuperarNome());
        System.out.println("Nome Professor: " +  Disc.RecuperarNomeProfessor());
        System.out.println("Carga Horária da Disciplina: " + Disc.RecuperarCargaHoraria());
    }
    scanner.close();
 }
}
