/* É possível uma classe herdar métodos e atributos de outra classe no Java
* - subclass (child) - classe que herda de outra classe
* - superclass (parent) - classe que é herdada
*
* - para herdar, devemos usar a palavra chave extends
* */

package classes.inheritance;

public class Vehicle {
//    utilizamos protected no atributo brand, mas se tivéssemos usado private, a classe Car não poderia acessá-la
    protected String brand = "Ford";
    public void honk() {
        System.out.println("BEE BEE!");
    }
}

class Car extends Vehicle {
    private String model = "Mustang";
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.honk();

        System.out.println(myCar.model + " " + myCar.brand);
    }
}
