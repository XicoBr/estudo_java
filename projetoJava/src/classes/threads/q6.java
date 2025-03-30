package classes.threads;
import java.util.concurrent.atomic.AtomicInteger;
/*
    CONTADOR COMPARTILHADO(AtomicInteger)
Crie um contador global (AtomicInteger) incrementado por duas threads diferentes. Cada thread deve
incrementar o contador 5 vezes e imprimir o valor atualizado.

Exemplo de saída esperada (a ordem pode variar):

    Contador1: 1
    Contador1: 2
    Contador1: 3
    Contador1: 4
    Contador1: 5
    Contador2: 6
    Contador2: 7
    Contador2: 8
    Contador2: 9
    Contador2: 10


*/


class ShrCounter {
    private final AtomicInteger count = new AtomicInteger(0);

    public void increment(String threadName) {
        for (int i = 1; i <= 5; i++) {
            int valorAtual = count.incrementAndGet(); // Incrementa e obtém o novo valor do AtomicInteger
            // count
            System.out.println(threadName + ": " + valorAtual);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread " + threadName + " foi interrompida.");
            }
        }
    }
}

class ContadorThread implements Runnable {
    private final ShrCounter counter;
    private final String threadName;

    public ContadorThread(ShrCounter counter, String threadName) {
        this.counter = counter;
        this.threadName = threadName;
    }

    public void run() {
        counter.increment(threadName);
    }
}

class ExemploAtomicInteger {
    public static void main(String[] args) {
        ShrCounter counter = new ShrCounter();

        Thread thread1 = new Thread(new ContadorThread(counter, "Thread1"));
        Thread thread2 = new Thread(new ContadorThread(counter, "Thread2"));

        thread1.start();
        try {
            thread1.join(); // Aguarda a thread1 terminar antes de iniciar a próxima
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        thread2.start();
        try {
            thread2.join(); // Aguarda a thread2 terminar
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Counting completed.");
    }

}
