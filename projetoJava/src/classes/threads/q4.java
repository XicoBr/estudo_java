package classes.threads;

/*
    USANDO JOIN() PARA AGUARDAR UMA THREAD
Crie uma thread que imprime "Processo iniciado", faz a thread dormir por 2 segundos (Thread.sleep(2000))
 e depois imprime "Processo concluído". No main(), aguarde essa thread terminar antes de imprimir "Fim do programa".

Exemplo de saída esperada:

Processo iniciado
(Processo pausa por 2 segundos)
Processo concluído
Fim do programa

*/

public class q4 extends Thread {

    public void run() {
        System.out.println("Processo iniciado");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrompida.");
        }
        System.out.println("Processo finalizado");
    }
}

class Exemplo1 {
    public static void main(String[] args) {
        q4 thread4 = new q4();
        thread4.start();

//        .join() garante que o código principal aguarde a thread terminar antes de rodar
        try {
            thread4.join();
        } catch (InterruptedException e) {
            System.out.println("Thread principal interrompida.");
        }
        System.out.println("Thread finalizada");
    }
}
