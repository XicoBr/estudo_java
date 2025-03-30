package classes.interfaces;

// multiplas interfaces separadas por vírgula
class demoClass implements multInterfaces, SecondInterface {
    public void myMethod() {
//        corpo implementado nos métodos da interface
        System.out.println("My first method");
    }
    public void myOtherMethod() {
        System.out.println("My second method");
    }
}
