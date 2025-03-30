package livros;

public class LivroFisico extends Livro{
//    construtor padrão
    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }
}
