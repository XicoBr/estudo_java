/*Construtores sao special method usados para inicializar objetos
  Devem ter o mesmo nome da CLASSE, e nao podem ser do retornar nada(void, return etc)
* Pode ser usado para atribuir valores a atributos*/
public class constructors {
    int x; // criacao de um atributo de classe

    // criando um constructor
    public constructors() {
        x = 5; // atribuindo valor para o atributo x da classe
    }

    public static void main(String[] args) {
        constructors obj = new constructors(); // criando o objeto que ira chamar o constructor
        System.out.println(obj.x);
    }

}