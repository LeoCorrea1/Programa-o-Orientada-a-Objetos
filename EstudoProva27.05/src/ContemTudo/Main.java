package ContemTudo;

public class Main {
    public static void main(String[] args) {
        // ======= AULA 06.05 - Instanciando classes e testando métodos =======
        Veiculo carro = new Carro("Toyota", "Corolla", 2020, 4);
        Veiculo moto = new Moto("Honda", "CB500", 2019, 500);

        // ======= POLIMORFISMO - Tratando diferentes objetos da mesma superclasse =======
        Veiculo[] veiculos = {carro, moto};
        for (Veiculo v : veiculos) {
            v.ligar();
            v.acelerar();
            v.frear();
            v.desligar();
            System.out.println();
        }

        // ======= LISTA3 / ListaExercicios - Herança + Classe abstrata =======
        Pessoa cliente = new Cliente("João Silva", "123.456.789-00");
        cliente.exibirInformacoes();

        // ======= ExerciciosAbstract + Interface =======
        OperacoesFinanceiras conta = new ContaBancaria("001", "João Silva");
        conta.depositar(1000);
        conta.sacar(250);
        conta.exibirSaldo();
    }
}
