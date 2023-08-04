package Main.Java.aula040823;

import java.time.LocalDate;
import java.util.List;

public class Venda {
    private LocalDate dataRegistro;
    private String cliente;
    private List<String> produtos;
    private Double precoTotal;

    // Para que não seja obrigatória criar um objeto completo
    public Venda(){}
    public Venda(LocalDate dataRegistro, String cliente, List<String> produtos, Double precoTotal) {
        setDataRegistro(dataRegistro);
        setCliente(cliente);
        setProdutos(produtos);
        setPrecoTotal(precoTotal);
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }
    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<String> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }
    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    //Para imprimir a informação do objeto na tela
    @Override // annotation (anotação) -> indica uma sobrescrita de método
    public String toString() {
        return "Venda{\n" +
                "dataRegistro=" + getDataRegistro() +
                ",\n cliente='" + getCliente() + '\'' +
                ",\n produtos=" + getProdutos() +
                ",\n precoTotal=" + getPrecoTotal() +
                "\n}";
    }
}
