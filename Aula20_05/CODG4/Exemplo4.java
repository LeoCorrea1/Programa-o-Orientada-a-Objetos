package CODG4;

public class Exemplo4 {

    interface PC{
        void verificaEmail();
    }

    interface Celular{
        void realizarChamada();
    }

    public class Smartphone implements Celular , PC{
        String tel;
        String email;

        public Smartphone(String tel, String email){
            this.tel = tel;
            this.email = email;
        }

        @Override
        public void realizarChamada() {
            System.out.println("Realizando chamada para " + tel);

        }

        @Override
        public void verificaEmail() {
            System.out.println("Verificando email " + email);

        }
    }

    public static void main(String[] args) {
        Exemplo4 exemplo = new Exemplo4();
        Smartphone smartphone = exemplo.new Smartphone("123456789", "dasdsadsadsa@ufn.edu");

        System.out.println("Telefone: " + smartphone.tel);
        System.out.println("Email: " + smartphone.email);
        smartphone.realizarChamada();
        smartphone.verificaEmail();
    }
}
