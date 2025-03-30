package classes.threads;

/*Crie um programa que inicie três threads. Cada uma delas deve imprimir seu número de identificação (por
exemplo, "Thread 1 executando", "Thread 2 executando", etc.).

Exemplo de saída esperada (a ordem pode variar):

Thread 1 executando
Thread 2 executando
Thread 3 executando

*/

public class q3 extends Thread {
    private final int numero;

//    construtor da thread recebe um número para identificação
    public q3(int numero) {
        this.numero = numero;
    }

    public void run() {
        System.out.println("Thread " + numero + " executando");
    }
}

// classe Main
class Exemplo {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            q3 thread = new q3(i);
            thread.start();
        }
    }
}
