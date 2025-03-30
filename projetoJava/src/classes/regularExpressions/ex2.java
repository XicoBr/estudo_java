package classes.regularExpressions;
import java.util.regex.*;

/*
* 2. Validar um endereço de email
Descrição: Escreva um programa que valide um email com base no seguinte padrão:

Deve conter um nome de usuário antes do "@" (apenas letras, números, ponto ou sublinhado).
Deve conter um domínio após o "@" (letras e números).
Deve terminar com um sufixo de domínio (ex.: .com, .org, .br).
* */

public class ex2 {
    public static void main(String[] args) {
        Pattern usrNm = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2}$");
        Matcher usrNmMatcher = usrNm.matcher("evas@hotmail.com");
        boolean usrNmFound = usrNmMatcher.find();

        if (usrNmFound) {
            System.out.println("Valid email address found");
        } else {
            System.out.println("Not valid email address found");
        }
    }
}
