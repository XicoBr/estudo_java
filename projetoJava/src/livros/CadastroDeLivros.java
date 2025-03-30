package livros;

public class CadastroDeLivros {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("turini@gmail.com");
        autor.setCpf("123.456.789.00");

        Livro livro = new LivroFisico(autor);


        livro.setNome("Java 1");
        livro.setDescricao("Java Livro");
        livro.setValor(59.90);

        livro.aplicaDescontoDe(0.1);
        livro.mostrarDetalhes();

//        Livro 2 e seu autor
        Autor autor2 = new Autor();
        autor2.setNome("Paula Tejano");
        autor2.setEmail("paula@gmail.com");
        autor2.setCpf("567.974.452.00");

//        passando o autor como parametro graças ao construtor da classe livro
        Livro livro2 = new LivroFisico(autor2);
        livro2.setNome("Python 2");
        livro2.setDescricao("Python Livro");
        livro2.setValor(49.90);
        livro2.setIsbn("789-8-22-108410-0");

        livro2.aplicaDescontoDe(0.4);
        livro2.mostrarDetalhes();


//        criando autor do ebook
        Autor autorEbook = new Autor();
        autorEbook.setNome("Rodrigo Ola");
        autorEbook.setEmail("ola@gmail.com");
        autorEbook.setCpf("3221.456.789.00");

//        criando um ebook
        Ebook ebook = new Ebook();
        ebook.setNome("Java Ebook");
        ebook.setDescricao("Java Ebook Nova Edição");
        ebook.setIsbn("503.456.789.00");
        ebook.setValor(89.90);
        ebook.setAutor(autorEbook);
        ebook.mostrarDetalhes();


    }
}
