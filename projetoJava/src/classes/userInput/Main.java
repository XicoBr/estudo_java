package classes.userInput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//  necessário criarmos um objeto de Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println(name + " is " + age + " years old");

    }
}
