package livros;

public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        double soma = 0;
        int contador = 0;

        while(contador < 35) {
            double valorDoLivro = 59.90;
            soma += valorDoLivro;
            contador++;
        }
        System.out.println("Total em estoque: " + soma);

        if(soma < 150) {
            System.out.println("Estoque baixo.");
        } else if(soma >= 300) {
            System.out.println("Estoque acima do recomendado.");
        } else {
            System.out.println("Estoque no nível recomendado.");
        }
    }
}
