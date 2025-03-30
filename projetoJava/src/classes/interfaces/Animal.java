package classes.interfaces;

/* Classe abstrata
 * - é outro meio para alcançarmos abstraçao;
 * - agrupa métodos relacionais com bodies vazios;
 * - para acessar os métodos de interface, a interface deve ser implementada (tipo "herdada") por outra classe com a
 * palavra chave implements;
 * - lembrar que os métodos de interface nao tem corpo, o corpo é fornecido pela classe implementada
 * - na implementacao de uma interface, devemos sobrescrever todos os seus métodos
 * - os métodos de interface são por padrão abstract e public
 * - atributos são por padrão static, public e final
 * - a interface não pode ter um constructor já que não pode ser usada para criar objetos
 *  */


interface Animal {
    //    métodos de interface sem 'corpo'
    void animalSound();
    void run();
}


