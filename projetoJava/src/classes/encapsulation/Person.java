/*Consiste em ocultar dados sensíveis de usuários.
 * - fazemos isso quando:
 *   - declaramos atributos e variáveis de classe como PRIVATE;
 *   - fornecemos methods GET e SET publico para acessar e atualizar os valores de uma variável privada;
 *OBS:
 *   - lembrar que variáveis privadas só podem ser acessadas dentro da mesma classe, a menos que tenhamos fornecido
 * métodos get e set publicos
 *
 * MÉTODOS GET E SET:
 *   - GET retorna o valor da variável;
 *   - SET atribui o valor à variável;
 *
 * SINTAXE:
 *   - começam com GET ou SET, seguido do nome da variável com a primeira letra em maiúsculo:
 * */
package classes.encapsulation;


public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}
