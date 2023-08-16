package Main.Java.aula150823.heranca;

import java.time.LocalDate;

public class Comida extends Produto{
    private LocalDate dataValidade;
    private Float categoria;

    public Comida() {
    }
    public Comida(String nome, Double preco, String codigo, LocalDate dataValidade, Float categoria) {
        super(nome, preco, codigo);
        this.dataValidade = dataValidade;
        this.categoria = categoria;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Float getCategoria() {
        return categoria;
    }
    public void setCategoria(Float categoria) {
        this.categoria = categoria;
    }
}
