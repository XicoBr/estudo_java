/*
*- ACCESS MODIFIERS:
*   - FOR CLASSES:
*       - public - a classe é acessível por outras classes; pode ser acessada APENAS com a criacao de um objeto de
* classe
*       - default - a classe é acessível apenas pelo mesmo pacote
*
*   - FOR ATRIBUTES, METHODS AND CONSTRUCTORS:
*       - public - o código é acessível por todas as classes
*       - private - é acessível apenas dentro da classe declarada
*       - default - mesmo pacote
*       - protected - acessível apenas no mesmo pacote e mesma subclasse
*
*- NON ACCESS MODIFIERS:
*   - FOR CLASSES:
*       - final - a classe nao pode ser estendida ou herdada por outra classe
*       - abstract - a classe nao pode ser usada para criar objetos (para acessa-la, ela deve ser estendida(extends)
* para outra
* classe)
*
*   - FOR ATRIBUTES AND METHODS:
*       - final - atributos e metodos nao podem ser modificados
*       - static -  a classes e nao a objetosatributos e metodos pertencem; pode ser acessada sem a criacao de um
* objeto de classe
*       - abstract - só podem ser utilizadas em classses abstratas e usada em metodos
*       - transient
*       - synchronized
*       - volatile
*
*
* */

public class modifiers {
    static void myStaticMethod() {
        System.out.println("Pode ser chamada sem a criacao de um objeto");
    }

    public void myPublicMethod() {
        System.out.println("Para chamá-la, precisamos criar um objeto da classe");
    }

    public static void main(String[] args) {
        myStaticMethod(); // chamando o static method

        modifiers myObj = new modifiers(); // criando o objeto de classe
        myObj.myPublicMethod(); // chamando o public method
    }
}