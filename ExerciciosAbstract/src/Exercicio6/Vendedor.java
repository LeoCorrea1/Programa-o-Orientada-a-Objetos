package Exercicio6;

public class Vendedor extends Funcionario {
    @Override
    public void calcularSalario() {
        double salarioComComissao = getSalario() + (getSalario() * 0.05);
        System.out.println("Salário do vendedor " + getNome() + ": " + salarioComComissao);

        System.out.println("salario anual do vendedor " + getNome() + ": " + (salarioComComissao * 12));
    }
}
