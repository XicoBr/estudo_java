/* ASSIGNMENT OPERATORS:
*   - operador de deslocamento(>>) - desloca os bits de uma variável para x posições para a direita.
*       - exemplo:
*           x = 5 → Binário (32 bits):
            00000000 00000000 00000000 00000101
            * com o deslocamento à direita:
            00000000 00000000 00000000 00000000  (resultado após o deslocamento)
*   - operador

*
*
* BITWISE OPERATORS:
   - & - realiza uma operação AND bit a bit entre valores;
   exemplo:
       - x = 5;
       - x &= 3;
       - os números são convertidos para suas representações binárias:
       - x = 5 -> Binário: 00000000 00000000 00000000 00000101
       - 3 ->     Binário: 00000000 00000000 00000000 00000011
       - a operação AND bit a bit compara os bits correspondentes dos dois valores, seguindo a regra:
       - 1 & 1 = 1;
       - 1 & 0 = 0;
       - 0 & 1 = 0;
       - 0 & 0 = 0;
         00000000 00000000 00000000 00000101  (5 em binário)
       & 00000000 00000000 00000000 00000011  (3 em binário)
         --------------------------------------
         00000000 00000000 00000000 00000001  (1 em binário);

    - |(pipe) - realiza uma operação OR bit a bit entre valores:
    - int x = 5;
    - x |= 3;
    x = 5 → Binário: 00000000 00000000 00000000 00000101
        3 → Binário: 00000000 00000000 00000000 00000011
        Comparação:
        1 | 1 = 1
        1 | 0 = 1
        0 | 1 = 1
        0 | 0 = 0
        * Realizando operação:
            00000000 00000000 00000000 00000101  (x em binário)
            |00000000 00000000 00000000 00000011  (3 em binário)
            --------------------------------------
            00000000 00000000 00000000 00000111  (resultado)

*
* */



public class javaOperators {
    public static void main(String[] args) {
        System.out.println("BITWISE OPERATORS");
        System.out.println("AND Operator");
        int x = 5;
        x &= 3;
        System.out.println("X = 5");
        System.out.println("X &= 3" + x);
        System.out.println("************");
        System.out.println("OR Operator");
        x = 5;
        x |= 3;
        System.out.println("X = 5");
        System.out.println("5 |= 3: " + x);
        System.out.println("-=-=-=-=-=-=-");

        //
        System.out.println("ASSIGNMENT OPERATORS");
        System.out.println("Right Deslocate Operator");
        x = 5;
        x >>= 1;
        System.out.println("X = 5");
        System.out.println("X >>= 1" + x);
        System.out.println("-=-=-=-=-=-=-");

    }
}