package Estudo1;

//oque estou estudando aqui em casa é como criar funçoes publicas e estaticas em java, 
//tambem criando classes dentro do proprio projeto executavel

public class Main {

		//funçao void em java
	    //public – O método pode ser acessado de outras classes.
	    public void dizerOla() {
	        System.out.println("Olá, mundo!");
	    }
	    
	   //funçao int em java
	   //public – O método pode ser acessado de outras classes.
	    public int somar(int a, int b) {
	        return a + b;
	    }
	    //static - pode ser chamado sem criar um objeto da classe
	    public static int somar2(int a, int b) {
	        return a + b;
	    }
	    //static - pode ser chamado sem criar um objeto da classe
	    public static void dizerOla2() {
	        System.out.println("Hello, World!");
	    }
	    
	    
public static void main(String[] args) {
	    	
 Main obj = new Main();
	        
    // Chamando os métodos publicos - método pode ser acessado de outras classes.
 	obj.dizerOla();
 	int resultado = obj.somar(5, 3);
 	System.out.println("Resultado da soma: " + resultado);
 	
    // Chamando os métodos estaticos - pode ser chamado sem criar um objeto da classe
 	dizerOla2();
 	int resultado2 = somar2(4, 7);
 	System.out.println("Resultado da soma: " + resultado2);
 }
}

	


