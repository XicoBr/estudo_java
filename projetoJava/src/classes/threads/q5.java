package classes.threads;

/*Crie uma classe com um méthodo que imprime números de 1 a 5, mas só pode ser executado por uma thread de
cada vez. Inicie duas threads e veja que a saída será controlada.*/

class Contador {
//    synchronized impede que mais de uma thread execute o méthodo(ou função) ao mesmo tempo
    public synchronized void contar(int id) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + id + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread foi interrompida.");
            }
        }
    }
}

//  q5 == minhaThread
public class q5 extends Thread {
//    criamos um objeto da classe Contador
    private final Contador contador;
    private final int id;

    q5(Contador contador, int id) {
        this.contador = contador;
        this.id = id;
    }
    public void run() {
        contador.contar(id);
    }
}

class ExemploSynchronized {
    public static void main(String[] args) {
        Contador contador = new Contador();

        q5 thread1 = new q5(contador, 1);
        q5 thread2 = new q5(contador, 2);

        thread1.start();
        thread2.start();
    }
}

