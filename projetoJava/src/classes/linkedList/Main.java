package classes.linkedList;
import java.util.LinkedList;

/*
*   É parecido com a arrayList, mas são construídos de formas diferentes.
*   DIFERENÇAS:
*       - ArrayList tem um array comum dentro dela. Quando um elemento é adicionado, ele é colocado dentro
* dessa lista comum. Se o array não for grande o sucifiente, um novo array é criado e substitui o antigo e
* o remove;
*       - LinkedList armazena seus itens em containers. A lista tem uma conexão com o primeiro container e
* cada container tem uma conexão com o próximo container na lista. Para adicionarmos um elemento na lista,
* o elemento é colocado em um novo container e o mesmo é conectado a um dos conteineres da lista.
*
* QUANDO USAR:
*       - Usar ArrayList para armazenar e acessar dados, e LinkedList para manipular os dados.
*
* */

public class Main {
    public static void main(String[] args) {
//        criando objeto cars
        LinkedList<String> cars = new LinkedList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);
    }
}
