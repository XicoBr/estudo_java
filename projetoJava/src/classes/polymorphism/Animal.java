package classes.polymorphism;

// criando a classe Animal
public class Animal {
    //    o corpo de animalSound() é fornecido abaixo; será sobrescrito quando criamos classes com o EXTENDS
    public void animalSound() {
        System.out.println("O animal faz um barulho");
    }
}

// as proximas classes herdam as características da classe animal
class Pig extends Animal {
    public void animalSound() {
        System.out.println("O porco faz OIN OINC!");
    }
}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("O gato faz MEOW MEOW!");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("O cachorro faz AU AU!");
    }
}
