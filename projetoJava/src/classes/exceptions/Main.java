package classes.exceptions;

/*
* Quando há um erro, Java vai encerrar o programa e gerar um erro. Ou seja, vai tentar lançar uma exceção
* (throw an error);
* TRY AND CATCH
*  - try permite que você defina um bloco de código a ser testado para erros enquanto é executado;
*  - catch permite que o usuario defina um bloco de código a ser executado se um erro ocorrer no bloco TRY;
*
* FINALLY
*  - permite que voce execute o código após try e catch, independente do resultado;
*
* THROW
*  - permite que voce lance uma mensagem de erro personalizada;
*  - é usada com um tipo de exceção;
* */

public class Main {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Acesso negado - Você deve ter no mínimo 18 anos");
        } else {
            System.out.println("Acesso permitido");
        }
    }
    public static void main(String[] args) {
        try {
            int[] myNumber = {1, 2, 3, 4, 5};
            System.out.println(myNumber[10]);
        }
        catch (Exception e) {
            System.out.println("Algo deu errado.");
        } finally {
            System.out.println("Try Catch finalizado.");
        }

        checkAge(15);
    }

}
