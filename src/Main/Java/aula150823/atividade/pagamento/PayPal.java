package Main.Java.aula150823.atividade.pagamento;

public class PayPal extends FormaPagamento{
    private String email;
    private Integer token;

    public PayPal() {
    }
    public PayPal(Double valorTotal, Status status, String email, Integer token) {
        super(valorTotal, status);
        this.email = email;
        this.token = token;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getToken() {
        return token;
    }
    public void setToken(Integer token) {
        this.token = token;
    }
}
