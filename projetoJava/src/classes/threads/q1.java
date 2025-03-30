package classes.threads;

/*Descrição:
Crie uma classe que estenda Thread, faça a thread imprimir "Executando a thread!" e depois a execute a partir do main().

Exemplo de saída esperada:

arduino
Copiar
Editar
Executando a thread!*/

public class q1 extends Thread {
    public static void main(String[] args) {
        q1 thread = new q1();
        thread.start();
    }
    public void run() {
        System.out.println("Executando a thread!");
    }
}
