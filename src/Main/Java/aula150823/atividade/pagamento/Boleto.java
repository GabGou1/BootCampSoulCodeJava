package Main.Java.aula150823.atividade.pagamento;

import java.time.LocalDate;

public class Boleto extends FormaPagamento{
    private Integer numBoleto;
    private LocalDate dataVencimento;
    private Integer codigoBarras;

    public Boleto() {
    }
    public Boleto(Double valorTotal, Status status, Integer numBoleto, LocalDate dataVencimento, Integer codigoBarras) {
        super(valorTotal, status);
        this.numBoleto = numBoleto;
        this.dataVencimento = dataVencimento;
        this.codigoBarras = codigoBarras;
    }

    public Integer getNumBoleto() {
        return numBoleto;
    }
    public void setNumBoleto(Integer numBoleto) {
        this.numBoleto = numBoleto;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Integer getCodigoBarras() {
        return codigoBarras;
    }
    public void setCodigoBarras(Integer codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
}
