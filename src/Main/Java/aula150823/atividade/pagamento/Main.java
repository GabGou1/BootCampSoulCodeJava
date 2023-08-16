package Main.Java.aula150823.atividade.pagamento;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FormaPagamento credito = new CartaoCredito(125.99, FormaPagamento.Status.PENDENTE, 123423423, "Gabriel", LocalDate.of(2023, 8, 15), 32);
        System.out.println(credito.getStatus());
    }
}
