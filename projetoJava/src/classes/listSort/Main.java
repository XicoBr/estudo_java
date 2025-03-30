package classes.listSort;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Honda");

//        ordenando a lista em ordem alfabética
        Collections.sort(cars);
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println("-=-=-=-=-=-=-=-=-");

        System.out.println("Ordem inversa:");
//        ordenando a lista em ordem inversa
        Collections.sort(cars, Collections.reverseOrder());
        for (String car : cars) {
            System.out.println(car);
        }

//        ordem de numeros
        nums.add(5);
        nums.add(3);
        nums.add(1);
        nums.add(11);
        nums.add(2);

        Collections.sort(nums);
        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}
