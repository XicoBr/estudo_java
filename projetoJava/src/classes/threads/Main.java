package classes.threads;

/*
 * É uma forma otimizada de executar o código;
 * Executa tarefas sem interromper o código principal.
 *
 * COMO CRIAR THREADS:
 *   - extendendo a class Thread e sobrescrevendo seu méthodo run();
 *      - devemos criar uma instancia da classe e chamar seu méthodo start();
 * \Class Main implements Runnable
 *   - implementando a interface Runnable;
 *     - devemos passar uma instancia da classe para o construtor de objeto da Thread e chamar o methodo
 * start();
 * Ex:
*   public class Main implements Runnable {
         public static void main(String[] args) {
             Main obj = new Main();
             Thread thread = new Thread(obj);
             thread.start();
             System.out.println("This code is outside of the thread");
         }
         public void run() {
            System.out.println("This code is running in a thread");
         }
    }
*
* DIFERENCAS:
*
*   - quando extendemos a classe thread, nao podemos extender nenhuma outra classe;
*   - quando implementamos uma interface Runnable, é possível extender de outras classes;
*
* PROBLEMAS DE CONCORRENCIA:
*
*   - já que tanto a thread quanto o programa principal são executados ao mesmo tempo, não sabemos qual
* será a ordem de execução. Quando a thread e o main leem e atribuem valores a variaveis, os valores são
* imprevisíveis.
*   Para evitarmos a concorrencia, devemos compartilhar poucos atributos entre as threads. Porém, caso seja
*  necessário o compartilhamento, podemos usar o méthodo da tread isAlive() para checar se a thread
* finalizou a execução do programa antes de usarmos qualquer atributo que a thread possa ter modificado
*  */

public class Main extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Main thread = new Main();

//        .start() faz com que a thread comece a rodar
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run() {
        amount++;
    }
}
