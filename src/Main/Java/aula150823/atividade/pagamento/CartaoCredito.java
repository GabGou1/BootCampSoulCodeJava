package Main.Java.aula150823.atividade.pagamento;

import java.time.LocalDate;

public class CartaoCredito extends FormaPagamento{
    private Integer numeroCartao;
    private String nomeTitular;
    private LocalDate dataVencimento;
    private Integer cvv;

    public CartaoCredito() {
    }
    public CartaoCredito(Double valorTotal, Status status, Integer numeroCartao, String nomeTitular, LocalDate dataVencimento, Integer cvv) {
        super(valorTotal, status);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataVencimento = dataVencimento;
        this.cvv = cvv;
    }

    public Integer getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(Integer numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Integer getCvv() {
        return cvv;
    }
    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }
}
