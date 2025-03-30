// todo programa deve conter o método main()

public class App { // o nome da classe sempre deve ser igual ao nome do arquivo
    public static void main(String[] args) throws Exception {

        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Hello, World!"); // System é uma classe built in que contem membros uteis, como 'out'(que
        // significa output), além do 'println'(print line)
        System.out.println("Nova linha?");

        System.out.print("Print na mesma linha ->");
        System.out.print(" de baixo");

        System.out.println("....");
        System.out.println(3 + 3);
        System.out.println(firstName);

        /*Tipos de dados
        *   primitivos - normalmente começam com uma letra minuscula e SEMPRE tem um valor, são construídos e
        * predefinidos na linguagem;
        *   não primitivos - se referem a objetos, podendo chamar métodos para realizar certas operações; podem ser
        * null. São Arrays, Classes, Strings
        * */

        // para declarar constantes, usamos a keyword final antes de declarmos o tipo de variável
        final char test = 'A';  // declarar um char em aspas simples
        final float myNum = 3.55f; // forma alternativa -> (float)value;
        System.out.println(test);
        System.out.println(myNum);

        int x = 6, y = 7, z = 8;
        // declarando um único valor para multiplas variáveis:
        int a, b, c; // primeiro devemos inicializá-las
        a = b = c = 50;

        System.out.println("Hello, " + fullName + "!");
        System.out.println("Soma: " + (x + y + z));
        System.out.println("Soma de único valor para múltiplas variáveis: " + (a + b + c));

        boolean check = true;
        boolean check2 = false;
        System.out.println(check);
        System.out.println(check2);

        // chars:
        char myVar1 = 67, myVar2 = 69, myVar3 = 77;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // lançando uma exceção:
        throw new Exception("Erro lançado!");
    }
}
/* Comentário multi-linhas */
