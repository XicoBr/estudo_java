/*
* - É possível aninhar classes que se pertencem, fazendo o código ser mais sustentável e legível
* - Para acessar uma innerclass, criamos um objeto do outerlass e depois criamos um objeto do innerclass
* */

package classes.innerClasses;

// criando um OuterClass
public class innerClasses {
    int x = 10;

//    se a class fosse static, não precisaríamos criar um objeto na classe Main para acessá-la
    class InnerClass {
        int y = 20;
    }
}

class Main {
    public static void main(String[] args) {
//        criamos o objeto da classe externa
        innerClasses myOut = new innerClasses();
//        criamos o objeto interno a partir do objeto que criamos anteriormente
        innerClasses.InnerClass myIn = myOut.new InnerClass();

        System.out.println(myIn.y + myOut.x);
    }
}
