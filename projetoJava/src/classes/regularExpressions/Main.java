package classes.regularExpressions;

/*
*  É uma ferramenta que processa e manipula textos, usadas para identificar padrões em strings;
*  Devemos importar o pacote java.util.regex para usá-la;
*
* CLASSES:
*  - Pattern Class - representa uma expressão regular compilada;
*  - Matcher Class - usado para fazer a busca de correspondencia numa string usando o padrão definido pelo
* Pattern;
*  - PatternSyntaxException - indica um erro na sintaxe ou expressão regular
* */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {

//        Objeto da busca de padrão
//        o segundo parametro em Pattern.compile é opcional
//        o valor padrão do segundo parametro é case sensitive
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);

//        padrao a ser analisado; percorre o texto e identifica onde o padrao aparece
        Matcher matcher1 = pattern.matcher("Visit W3Schools!");

//        criando um booleano para verificação com condicional if; não é necessário, mas é uma boa prática
        boolean matchFound = matcher1.find();

        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        System.out.println("-=-=-=-=-=-=-=-=-");

        Pattern pattern2 = Pattern.compile("\\d+"); // um ou mais dígitos
        String texto = "Hoje     é 25 de janeiro de 2025";
        System.out.println(texto);


        Matcher matcher2 = pattern2.matcher(texto);

        while (matcher2.find()) {
            System.out.println("Número encontrado: " + matcher2.group());
            System.out.println("Posição inicial: " + matcher2.start());
            System.out.println("Posição final: " + matcher2.end());
            System.out.println("-=-=-=-=-=-=-=-=-");
        }
    }
}
