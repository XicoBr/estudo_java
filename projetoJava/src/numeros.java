/*
* Numeros tipo inteiro - byte, short, int, long
*   - byte armazena números entre -128 a 127. Serve para gerenciar memória;
*   - short armazena números entre -32768 a 32767;
*   - int é padrão;
*   - long é maior que int
*
* Numeros do tipo float - float, double
*   - float - 6 a 7 dígitos;
*   - double - 15 a 16 dígitos;
*   - SEMPRE COLOCAR OU .f OU .d NO FINAL DO NÚMERO!! E EM CÁLCULOS, MELHOR USAR DOUBLE, POIS TEM MAIOR PRECISÃO!
*   float myNum = 5.75f;
    System.out.println(myNum);
*   double myNum = 19.99d;
    System.out.println(myNum);
    *
* Numeros Científicos: utilizar um "e" no numero indica exponenciação de 10;
*   - float f1 = 35e3f // >> 35 * 1000 == 35000
*   - double d1 = 12E4d // >> 12 * 10000 == 120000
*/

public class numeros {
    public static void main(String[] args) {
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
    }
}