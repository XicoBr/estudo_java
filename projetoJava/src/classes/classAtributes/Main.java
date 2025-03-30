package classes.classAtributes;

/*
* Um atributo é uma variável da classe;
* Outro termo para os atributos de classe é campos;
* Para acessarmos atributos, devemos criar um objeto de classe
* */

public class Main {
    int x = 5, y = 3;

//    podemos utilizar o modificador final quando não quisermos que o valor da variável seja alterado
    final int z = 10;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
        System.out.println(myObj.y);

//        modificando um atributo
        myObj.x += 30;
        System.out.println(myObj.x);
        System.out.println(myObj.z);
    }
}
