package classes.hashSet;
import java.util.HashSet;

/*
* HashSet é uma coleção de itens únicos;
* Para usá-la, precisamos criar um objeto da classe hashSet;
* Lembrar que itens em um HashSet são objetos. Lembrar também que String é um objeto, não um tipo primitivo
* */

public class Main {
    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("BMW");
//        mesmo que um elemento seja adicionado duas vezes, ele só aparecerá apenas uma vez, pois cada
//        elemento deve ser único no HashSet

        System.out.println(cars);

//        verificando se um elemento existe
        System.out.println(cars.contains("Audi"));

//        loop through
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
