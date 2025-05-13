package ListaExercicios.EX1;

public class Boletim {

    public void imprimirStatus(Aluno aluno) {

        System.out.println("Nome: " + aluno.getNome());
        aluno.calcularMedia();

        if( aluno.calcularMedia() >= 6) {
            System.out.println("Aprovado");
        }
            else
            System.out.println("Reprovado");

        }

    }

