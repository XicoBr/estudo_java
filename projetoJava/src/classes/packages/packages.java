package classes.packages;

import java.util.Scanner;  // utilizado para pegar input do usuario

public class packages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the package");

        String name = sc.next();

        System.out.println("Package name is: " + name);

//        Sempre devemos encerrar a leitura do Scanner
        sc.close();
    }
}
