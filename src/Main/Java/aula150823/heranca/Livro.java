package Main.Java.aula150823.heranca;

public class Livro extends Produto{
    private Integer numPags;
    private String isbn;

    public Livro() {
    }
    public Livro(String nome, Double preco, String codigo, Integer numPags, String isbn) {
        super(nome, preco, codigo);
        this.numPags = numPags;
        this.isbn = isbn;
    }

    public Integer getNumPags() {
        return numPags;
    }
    public void setNumPags(Integer numPags) {
        this.numPags = numPags;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
