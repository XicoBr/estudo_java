/*
* String é na verdade um objeto e que contém métodos para certas operações
*
* */

public class strings {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String fullName = String.join(" ", firstName, lastName);
        System.out.println(fullName);
        String txt = "Hello \"THE\" World!";
        System.out.println(txt);
        System.out.println("O tamanho da string é de " + txt.length() + " caracteres");
        System.out.println(txt.indexOf("orld!"));

    }
}