package classes.arrayList;
import java.util.ArrayList;
import java.util.Collections;

/* - A classe ArrayList é redimensionável, enquanto um array padrão não, então não podemos adicionar ou
remover itens de um  array comum;
* - Para usá-la, devemos importar a classe util.ArrayList
* */

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");

//        Adicionando elemento
        cars.add(1, "Mercedes" );
        System.out.println(cars);

//        Acessando um elemento
        System.out.println(cars.get(1));

//        Modificando um elemento
        cars.set(0, "Ferrari");
        System.out.println(cars);

//        Removendo um elemento
//        pode-se usar os dois métodos abaixo
//        cars.remove(0);
        cars.removeFirst();
        System.out.println(cars);
//        o método clear() remove todos os elementos

//        Acessando o tamanho do Array
        System.out.println(cars.size());

//        Organizando a lista
        Collections.sort(cars);

//        Loop Through
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
