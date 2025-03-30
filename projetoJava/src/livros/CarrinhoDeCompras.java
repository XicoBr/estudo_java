package livros;

public class CarrinhoDeCompras {
    private double total;

//    utilizando polimorfismo para nos referirmos tanto a livros físicos quanto ebooks
//    passamos como parâmetro a superclasse Livro como parametro
    public void adiciona(Livro livro) {
//        utilizando casting para converter um objeto do tipo livro para o tipo Ebook. É um exemplo de
//        downcasting: superclasse -> subclasse;
//        upcasting: subclasse -> superclasse;
    if(livro instanceof Ebook) {
        Ebook ebook = (Ebook) livro;
        ebook.getWaterMark();
        System.out.println("Adicionando Ebook " + livro);
    }else {
        System.out.println("Adicionando livro " + livro);
    }
        total += livro.getValor();
        livro.aplicaDescontoDe(0.05);

    }

    public double getTotal(){
        return total;
    }


}
