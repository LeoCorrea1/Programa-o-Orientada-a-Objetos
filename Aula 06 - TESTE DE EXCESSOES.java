package Lista3.Aula25_03;

public class Principal {
    public static void main(String[] args) {
        int[] numeros = {1,2,3};
        try {
        System.out.println(numeros[99]);
        }
        catch ( ArrayIndexOutOfBoundsException e ) {
            System.out.println("excessao : " + e.getMessage());
            System.out.println("Excessao : " + e.toString());
        }
        catch (Exception e) {
            System.out.println("excessao : " + e.toString());
        }
        System.out.println("programa segue em em execuçao");
        System.out.println(numeros[3]);
        System.out.println("Agora nao");

//        //exemplo 2
//        int a = 10;
//        int b = 0;
//        System.out.println(a/b);
//
//
//
//        //exemplo 3
//        String numero = "abc";
//        int valor = Integer.parseInt(numero);

        }

    }

