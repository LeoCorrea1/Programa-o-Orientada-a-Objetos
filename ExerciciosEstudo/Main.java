package ExerciciosEstudo;

import java.util.ArrayList;

abstract class MembroComunidade {
    private String nome;
    private int idFuncional;

    public MembroComunidade(String nome, int idFuncional) {
        this.nome = nome;
        this.idFuncional = idFuncional;
    }

    public String getNome() {
        return nome;
    }

    public int getIdFuncional() {
        return idFuncional;
    }

    public void exibirDetalhesBasicos(){
        System.out.println("Nome: " + nome);
        System.out.println("ID Funcional: " + idFuncional);
    }
    public abstract void trabalhar();

}

interface bonificavel{

    double percentualBonus = 0.10;

    void calcularBonus(double salarioBase);

}

  class Aluno extends MembroComunidade {

     private String curso;
     ArrayList<Double> notas = new ArrayList<>();

     public Aluno(String nome, int idFuncional, String curso) {
         super(nome, idFuncional);
         this.curso = curso;
     }

     public String getCurso() {
         return curso;
     }

     public void setCurso(String curso) {
         this.curso = curso;
     }

     public void adicionarNota(double nota) {
         notas.add(nota);
     }

     public void adicionarNota(String nota) {
         try {
             double notaDouble = Double.parseDouble(nota);
             notas.add(notaDouble);
         } catch (NumberFormatException e) {
             System.out.println("Nota inválida: " + nota);
         }
     }

     public void calcularMedia() {
         double soma = 0;

         for (double nota : notas) {
             soma += nota;
         }
         double media = soma / notas.size();
         System.out.println("Média: " + media);
     }

     public void exibirBoletim() {
         System.out.println("Boletim do Aluno:");
         exibirDetalhesBasicos();
         System.out.println("Curso: " + curso);
         System.out.println("Notas: " + notas);
         calcularMedia();

     }

     public void trabalhar() {
         System.out.println("Aluno " + getNome() + " está estudando para o curso de : " + getCurso());
     }
 }


    class Professor extends MembroComunidade implements bonificavel {

        private String departamento;
        private Double salarioBase;

        public Professor(String nome, int idFuncional, String departamento, Double salarioBase) {
            super(nome, idFuncional);
            this.departamento = departamento;
            this.salarioBase = salarioBase;
        }

        public Double getSalarioBase() {
            return salarioBase;
        }

        public void setSalarioBase(Double salarioBase) {
            this.salarioBase = salarioBase;
        }

        public String getDepartamento() {
            return departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

        public void trabalhar() {
            System.out.println("Professor " + getNome() + " está lecionando no departamento de: " + getDepartamento());
        }

        public void calcularBonus(double salarioBase) {
            double bonus = salarioBase * percentualBonus + 300;
            System.out.println("Bônus do Professor " + getNome() + ": R$" + bonus);
        }
    }
        public class Main{
            public static void main(String[] args) {
                ArrayList<MembroComunidade> membros = new ArrayList<>();
                Aluno aluno1 = new Aluno("Ana", 100, "Ciência da Computação");
                membros.add(aluno1);
                Aluno aluno2 = new Aluno("Maria", 102, "Medicina");
                membros.add(aluno1);

                aluno1.adicionarNota(7.5);
                aluno1.adicionarNota(8.5);
                aluno1.adicionarNota(9.5);
                aluno1.adicionarNota("nota 9");
                aluno2.adicionarNota(8.5);
                aluno2.adicionarNota("nota 8");

                Professor professor1 = new Professor("Dr. Silva", 200, "Engenharia", 5000.0);
                membros.add(professor1);
                Professor professor2 = new Professor("Prof. Souza", 201, "Matemática", 6000.0);
                membros.add(professor2);

                for (MembroComunidade membro : membros) {
                    membro.exibirDetalhesBasicos();

                    if (membro instanceof Aluno) {
                        Aluno aluno = (Aluno) membro;
                        aluno.exibirBoletim();
                        aluno.trabalhar();
                    } else if (membro instanceof Professor) {
                        Professor professor = (Professor) membro;
                        professor.trabalhar();
                        professor.calcularBonus(professor.getSalarioBase());
                    }

                    System.out.println("-----------------------------");
                }


                //aluno1.curso("Engenharia de Software");
                //da erro porque eu nao estou usando o setcurso

                aluno1.setCurso("engenharia de Software");
                System.out.println("Curso atualizado do aluno: " + aluno1.getCurso());
                aluno1.exibirBoletim();
                }

            }



