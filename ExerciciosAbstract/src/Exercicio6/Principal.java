package Exercicio6;

public class Principal {
    public static void main(String[] args) {
        Funcionario Gerente = new Gerente();
        Gerente.setNome("João");
        Gerente.setSalario(10000);
        Gerente.calcularSalario();

        System.out.println("\n");

        Funcionario Vendedor = new Vendedor();
        Vendedor.setNome("Maria");
        Vendedor.setSalario(1280);
        Vendedor.calcularSalario();

    }
}
