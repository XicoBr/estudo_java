package livros;

public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;

//    Construtores de classe - um para passarmos como parametro o autor do livro, o outro se não pudermos
//    passar o autor do livro
    public Livro(Autor autor) {
//        encadeando a chamada do construtor, ele executa o construtor padrao da classe Livro
//        lembrar que o this() deve ser a primeira instrução do construtor
        this();
        this.autor = autor;
        this.impresso = true;
//        setando um valor padrao para o isbn, caso o livro não tenha um

    }
//    construtor padrão
    public Livro() {
        this.isbn = "000-000-0000";
    }

    void mostrarDetalhes(){
        String mensagem = "\nDetalhes do Livro:\n";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: R$ " + valor);
        System.out.println("ISBN: " + isbn);
        if(temAutor()) {
            autor.mostrarDetalhes();
        }
        System.out.println("--");
    }

    boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.3) {
            return false;
//            criando uma regra de desconto para ebooks
        } else if(!impresso && porcentagem > 0.15) {
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }

//    Verifica se o livro tem um autor atribuído, e retorna no método mostrarDetalhes da classe Livro se
//     diferente de null
    boolean temAutor(){
        return this.autor != null;
    }

    void setValor(double valor){
        this.valor += valor;
    }

    double getValor(){
        return this.valor;
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getDescricao() {
        return descricao;
    }

    void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    String getIsbn() {
        return isbn;
    }

    void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    Autor getAutor() {
        return autor;
    }

    void setAutor(Autor autor) {
        this.autor = autor;
    }
}
