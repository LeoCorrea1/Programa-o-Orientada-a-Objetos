package EX7;

import java.util.Scanner;

public class EX7 {
	
public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

  int[][] notas = new int[3][4];
  int auxMenor = 0;
  int auxMaior = 0;
  int auxAlunoMe = 0;
  int auxAlunoMa = 0;

  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
      System.out.print("Digite a nota do aluno " + (i + 1) + " na disciplina " + (j + 1) + ": ");
      notas[i][j] = scanner.nextInt();

      if (i == 0 && j == 0) { 
    	  auxMaior = notas[i][j];
		  auxMenor = notas[i][j];
		  auxAlunoMa = i;
		  auxAlunoMe = i;
      }

      if (notas[i][j] > auxMaior) {
         auxMaior = notas[i][j];
         auxAlunoMa = i;
      } else if (notas[i][j] < auxMenor) {
         auxMenor = notas[i][j];
         auxAlunoMe = i;
      }
   }
}
  System.out.println("A maior nota é do aluno " + (auxAlunoMa + 1) + " com incriveis" + auxMaior + " pontos.");
  System.out.println("A menor nota é do aluno " + (auxAlunoMe + 1) + " com tristes" + auxMenor + " pontos.");

    }
}
