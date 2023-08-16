package Main.Java.aula150823.atividade.notificações;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Notificavel notificacao = new EmailNotificacao(LocalDate.now(), Notificavel.Verificado.ENVIADO, "Gabriel", "Mateus");
        notificacao.estado();
    }
}
