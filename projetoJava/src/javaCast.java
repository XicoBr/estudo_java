// é a atribuição de valores entre tipos diferentes
/* Há dois tipos de casting:
    - Widening Casting (automatico) - converte um tipo menor para um tipo maior
    byte -> short -> char -> int -> long -> float -> double
*   - Narrowing Casting (manual) - converte um tipo maior em um tipo menor
    double -> float -> long -> int -> char -> short -> byte
* */
public class javaCast {
    public static void main(String[] args) {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
        // widening casting
        int myInt = 9;
        // converte automaticamente para double
        double myDouble = myInt;

        System.out.println("Widening Casting");
        System.out.println("Int: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
        // Narrowing Casting
        System.out.println("Narrowing Casting");
        double myDouble2 = 9.78d;
        // colocamos o tipo entre parenteses na frente do valor
        int myInt2 = (int)myDouble2;

        System.out.println("Double2: " + myDouble2);
        System.out.println("Int2: " + myInt2);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
        int maxScore = 500;
        int usrScore = 423;
        float percentage =  (float) usrScore / maxScore * 100.0f;
        System.out.println("Percentage: " + percentage + "%");

    }
}