package livros;

// Ebook é uma subclasse que herda as características da classe Livro
public class Ebook extends Livro {

    private String waterMark;

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
    public String getWaterMark() {
        return waterMark;
    }
//   Como a classe Livro tinha um construtor obrigando a passagem de um Autor como parâmetro, ao herdar de um
//   Livro, a classe Ebook também herdou essa responsabilidade. Utilizamos o super() para passarmos tal
//   responsabilidade para a classe que foi herdada, no caso Livro.
    public Ebook(Autor autor) {
        super(autor);
    }
    public Ebook() {}

//    utilizamos a anotação @Override para garantirmos que um método da classe filha sobreescreva o método
//     da classe pai
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {

        if(porcentagem > 0.15) {
            return false;
        }
//        delegando a lógica do método para a classe pai utilizando a palavra SUPER
        return super.aplicaDescontoDe(porcentagem);
    }




}
