package classes.hashMap;
import java.util.HashMap;

/*
* Hashmap é uma associação de par chave-valor, como se fosse um dicionário em python;
* Para utilizarmos, precisamos importar sua classe e na criação de um objeto, devemos declarar o tipo de
* suas chaves e valores
* */

public class Main {
    public static void main(String[] args) {

//        criando um objeto da classe HashMap
        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("France", "Paris");
        capitalCities.put("Brazil", "Distrito Federal");

//        loop through
//        keySet() retorna as chaves do array
//        values() retorna os valores do array
        for (String country : capitalCities.keySet()) {
            System.out.println(country + " " + capitalCities.get(country));
        }
    }
}
