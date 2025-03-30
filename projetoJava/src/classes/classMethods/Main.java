package classes.classMethods;

/*
Methods = functions
Methods sao declarados dentro de classes e executam certas acoes
*/

public class Main {
    // Static Method pode ser acessado sem a necessidade de criarmos um objeto
    static void myStaticMethod() {
        System.out.println("Static method");
    }

    // chamando um public method
    // Public Method só pode ser acessado ao criarmos um objeto na Main
    public void myPublicMethod() {
        System.out.println("Public Method");
    }

    // Main Method
    public static void main(String[] args) {
        // chamando o Static Method
        myStaticMethod();

        // criando um objeto de classMethods
        Main myObject = new Main();
        // chamando objeto
        myObject.myPublicMethod();
    }
}
