package lambda;

/*�o um bloco de código curto que recebe parametros e retorna valores. São similares aos methodos, mas não
precisam de um nome e podem ser implementados diretamente no corpo de um méthodo
SINTAX:
- parameter -> expression
- (parameter1, parameter2) -> expression

OBS: Expressoes sao limitadas, devem retornar um valor imediatamente, nao podem conter variaveis,
atribuicoes ou declaracoes tipo IF ou FOR.
Para fazermos operacoes mais complexas, o bloco de código deve ser usado com chaves. Se a expressao lambda
precisar retornar um valor, o bloco de código deve ter um return declarado:
    - (parameter1, parameter2) -> { code block }

Expressoes lambda podem ser armazenadas em variaveis se a variavel for do tipo interface e tiver apenas um
méthodo. Deve ter o mesmo numero de parametros e retornar o mesmo tipo do méthodo.

*/

import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.forEach((n) -> {
            System.out.println(n);
        });

//        usando interface
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(6);
        numbers2.add(7);
        numbers2.add(8);
        numbers2.add(9);
        numbers2.add(10);

        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers2.forEach(method);

//        usando a expressao lambda em um méthodo
        StringFunction exclaim = (s) -> "!";
        StringFunction ask = (s) -> "?";
        printFormatted("Hello World", exclaim);
        printFormatted("Hello World", ask);


    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
