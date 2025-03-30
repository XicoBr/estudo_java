package classes.threads;

/*Em vez de estender Thread, implemente a interface Runnable. A thread deve imprimir "Thread com Runnable executando!".

Exemplo de saída esperada:

Thread com Runnable executando!*/

public class q2 implements Runnable {
    public static void main(String[] args) {
        q2 obj = new q2();
        Thread thread = new Thread(obj);
        thread.start();
    }
    public void run() {
        System.out.println("Thread com Runnable executando!");
    }
}
