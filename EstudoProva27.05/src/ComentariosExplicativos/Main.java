package ComentariosExplicativos;

import java.util.ArrayList;

// Interface que define um contrato de comportamento
interface Cuidador {
    void cuidarPatio();
}

// Classe abstrata que define atributos comuns
abstract class Animal {
    protected String especie;
    protected int idade;

    public Animal(String especie, int idade) {
        this.especie = especie;
        this.idade = idade;
    }

    // Método abstrato: obrigatoriamente precisa ser implementado pelas subclasses
    public abstract void emitirSom();

    // Método comum (não abstrato)
    public void exibeDados() {
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade + " anos");
    }
}

// Classe concreta que herda de Animal e implementa interface Cuidador
class Cachorro extends Animal implements Cuidador {
    private String raca;

    public Cachorro(String especie, int idade, String raca) {
        super(especie, idade); // chama o construtor da classe mãe (Animal)
        this.raca = raca;
    }

    // Implementação obrigatória do método abstrato
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }

    // Método da interface
    @Override
    public void cuidarPatio() {
        System.out.println("O cachorro está cuidando do pátio!");
    }

    // Sobrescrita de método (polimorfismo dinâmico)
    @Override
    public void exibeDados() {
        super.exibeDados(); // chama o método da classe mãe
        System.out.println("Raça: " + raca);
    }

    // Polimorfismo estático (método com mesmo nome e diferentes parâmetros)
    public void emitirSom(String humor) {
        if (humor.equalsIgnoreCase("feliz")) {
            System.out.println("Au au au! (feliz)");
        } else {
            System.out.println("Grrrr... (irritado)");
        }
    }
}

// Outra subclasse de Animal
class Gato extends Animal {
    public Gato(String especie, int idade) {
        super(especie, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato mia: Miau!");
    }
}

// Classe principal com testes
public class Main {
    public static void main(String[] args) {
        // Lista de animais
        ArrayList<Animal> animais = new ArrayList<>();

        // Adicionando diferentes animais (polimorfismo)
        animais.add(new Cachorro("Canis", 5, "Labrador"));
        animais.add(new Gato("Felis", 3));

        for (Animal animal : animais) {
            System.out.println("\n--- Animal ---");
            animal.exibeDados();   // polimorfismo
            animal.emitirSom();    // polimorfismo dinâmico

            // instanceof para verificar se o animal é um cachorro
            if (animal instanceof Cachorro) {
                Cachorro c = (Cachorro) animal;
                c.cuidarPatio(); // método da interface
                c.emitirSom("feliz"); // polimorfismo estático
            }
        }
    }
}
