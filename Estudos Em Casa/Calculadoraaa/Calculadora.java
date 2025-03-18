package Aula18_03.Calculadoraaa;

public class Calculadora {
    public double n1;
    public double n2;

    public double somar(){
   
        return n1+n2;
    }
    public double Multiplicar(){
   
        return n1*n2;
    }
    public void Dividir(double num1, double num2){
   
       System.out.println("RESULTADO DA DIVISAO : "+num1/num2); 

    }
    public void Subtrair(double num1, double num2){
   
        System.out.println("RESULTADO DA SUBTRAÇAO : "+(num1-num2)); 
 
     }

}
