package Exercicio6;

public class Gerente extends Funcionario{

    @Override
    public void calcularSalario() {
        double salarioComBonus = getSalario() + (getSalario() * 0.10);
        System.out.println("Salário do gerente " + getNome() +  ": " + salarioComBonus);

        System.out.println("salario anual do gerente " + getNome() + ": " + (salarioComBonus * 12));
    }
}
