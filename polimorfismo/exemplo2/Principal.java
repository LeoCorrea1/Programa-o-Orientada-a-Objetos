package polimorfismo.exemplo2;

public class Principal {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();


        pessoa.nome = "Joao";
        System.out.println("Nome Pessoa Feliz: " + pessoa.nome);
        pessoa.trabalhar();

        System.out.println("\n");

        Programador pr = new Programador();

        pr.nome = "joazin";

        pr.linguagem = "java";
        System.out.println("Nome do programador: " + pr.nome);
        System.out.println("linguagem: " + pr.linguagem);
        pr.trabalhar();
    }
}
