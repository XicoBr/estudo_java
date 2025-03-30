package classes.regularExpressions;
import java.util.regex.*;

/*
*Verificar se uma String é um número inteiro;
Descrição: Escreva um programa que verifique se uma string contém apenas números inteiros positivos.
Regex esperado: ^\d+$
* Exemplo:
Entrada: "12345" → Saída: É um número.
Entrada: "12a45" → Saída: Não é um número.
* */

public class ex1 {
   public static void main(String[] args) {
       Pattern pattern = Pattern.compile("^\\d$", Pattern.CASE_INSENSITIVE);
       Matcher matcher = pattern.matcher("123a45");
       boolean found = matcher.find();

       if (found) {
           System.out.println("It is a number.");
       } else {
           System.out.println("It is not a number.");
       }
   }
}
