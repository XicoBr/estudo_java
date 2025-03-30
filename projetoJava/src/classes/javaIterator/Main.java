package classes.javaIterator;
import java.util.ArrayList;
import java.util.Iterator;

/*
* O iterator é um objeto que é usado para percorrer coleções, como ArrayList e HashSet;
* Devemos importar o pacote java.util para utilizá-lo;
* Ele itera(percorre algo do inicio ao fim) sobre os itens da coleção;
* */

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Mazda");

//        criando o iterator
        Iterator<String> it = cars.iterator();

//        printando o primeiro item
        System.out.println(it.next());

        System.out.println("-=-=-=-=-=-=-");
        System.out.println("Percorrendo a coleção:");
//        percorrendo a coleção
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-=-=-=-=-=-=-");
        System.out.println();
//        removendo itens de uma coleção
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(29);
        numbers.add(4);
        numbers.add(5);
        numbers.add(10);

        numbers.removeIf(i -> i < 10);
        /*pode ser feito da maneira tradicional:
            while(number.hasNext()) {
                Integer i = number.next();
                if (i < 10) {
                    number.remove();
                }
            }
        * */
        System.out.println(numbers);

//        OBS: tentar remover itens usando um loop for ou um loop for-each não funcionará corretamente, pois
//        a coleção muda de tamanho ao mesmo tempo em que o código tenta realizar o loop

    }
}
