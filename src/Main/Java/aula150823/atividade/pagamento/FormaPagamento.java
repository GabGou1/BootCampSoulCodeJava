package Main.Java.aula150823.atividade.pagamento;

public abstract class FormaPagamento {
    enum Status{
        PAGO,
        PENDENTE,
        RECUSADO
    }

    private Double valorTotal;
    private Status status;

    public FormaPagamento() {
    }
    public FormaPagamento(Double valorTotal, Status status) {
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public Double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
}
