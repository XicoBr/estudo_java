package classes.wrapperClasses;

/*
* Classes de envelopamento fornecem maneiras de usar tipos primitivos como OBJETOS
* Algumas vezes precisamos usar wrapper classes quando trabalhamos com objetos de Collections, por exemplo
* ArrayList, onde não podemos usar tipos primitivos::
*   - ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
*   - ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid*
* */

public class Main {
    public static void main(String[] args) {
//    criando objetos de envelopamento
        Double myDouble = 5.99;
        Character myChar = 'a';
        Integer myInt = 5;

        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
        System.out.println(myInt.intValue());
        System.out.println("-=-=-=-=-=-=-=-=-");

//        convertendo wrapper objects em strings
        Integer myInte = 100;
        String myStr = myInte.toString();

        System.out.println(myStr);
        System.out.println(myStr.length());

    }
}
