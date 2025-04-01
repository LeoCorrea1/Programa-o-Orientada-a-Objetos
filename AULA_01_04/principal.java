package Exerccio1;

public class principal {
    public static void main(String[] args) {

        pessoa p = new pessoa("leonardo" , 19 , "2132133322");
        int idade , ano ;

        idade = p.getIdade();
        ano = 2025 - idade;

        p.ApresentaDados();
        System.out.println("ano de nascimento: " + ano);

        p.setIdade(-20);
        idade = p.getIdade();

        p.setIdade(-220);
        p.setNome(p.getNome() + " Correa");
        p.setCpf("32342344444");
        p.ApresentaDados();
        
        System.out.println("nome :" + p.getNome() );
    }

}
