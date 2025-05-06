package EX3;

public class Gerente extends Funcionario{

    public Double CalcularSalario(Double Salario, Double bonus){
        return (Salario * 12) / (bonus/100);

    }
}
