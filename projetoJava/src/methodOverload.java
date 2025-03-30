/*Consiste em usar o mesmo nome para metodos diferentes*/

public class methodOverload {
    static int myMethod(int a, int b) {
        return a + b;
    }
    static float myMethod(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        int a = myMethod(4, 6);
        float b = myMethod(8, 4);
        System.out.println(a);
        System.out.println(b);
    }
}