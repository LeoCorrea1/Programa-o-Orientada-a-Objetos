package polimorfismo.exemplo1;

public class Principal {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.nome = "Animal 1 ";
        a.emitirSom();

        Cachorro c = new Cachorro();
        c.nome = "Cachorro 1 ";
        c.raca = "pitmonster";
        System.out.println("raça do cachorro : "+c.raca);
        c.emitirSom();

        System.out.println("classe animal : chamando construtor cachorro");

        a = new Cachorro();
        a.emitirSom();

        Passarinho p = new Passarinho();
        p.cor = "vermelho";
        System.out.println("cor do passarinho : "+p.cor);
        p.emitirSom();
    }

}
