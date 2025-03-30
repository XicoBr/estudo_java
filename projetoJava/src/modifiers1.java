abstract class modifiers1 {
    public String fName = "John";
    public int age = 20;
    public abstract void study(); // metodo abstrato
}

// Subclasse (herda de modifiers1)
// para acessar uma classe abstrata, ela deve ser estendida(extend) para outra classe
// herda todos os atributos e metodos da classe
class Student extends modifiers1 {
    public int gradYear = 2027;

    // corpo do metodo abstrato vai aqui
    public void study() {
        System.out.println("Lets fooking study.");
    }
}