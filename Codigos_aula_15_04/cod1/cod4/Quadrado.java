package LIsta6_POO.Codigos_aula_15_04.cod1.cod4;

public class Quadrado extends Desenho2D{
    protected String desc;

    public Quadrado(int altura, int largura, String desc) {
        super(altura, largura);
        this.desc = desc;
    }
    public void exibeDados(){

        System.out.println("nome Autor : " + nomeAutor);
        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        System.out.println("Descricao: " + desc);

    }
}
