package EX2;

public class EX2 {

public static void main(String[] args) {
       
   int[][] tabuada = new int[10][10];

        
   for (int i = 1; i < 10; i++) {
       for (int j = 1; j < 10; j++) {
           tabuada[i][j] = (i) * (j); 
       }
   }

    for (int i = 1; i < 10; i++) {
       for (int j = 1; j < 10; j++) {
           System.out.print(tabuada[i][j] + "\t"); 
       }
     System.out.println();  
    }
  }
}


