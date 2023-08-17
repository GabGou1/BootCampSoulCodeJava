package Main.Java.aula150823.atividade.notificações;

public class Main {
    public static void main(String[] args) {
        Notificavel emailNotificacao = new EmailNotificacao("Gabriel", "Mateus");
        emailNotificacao.estado();

        Notificavel smsNotificacao = new SMSNotificacao(93123132, 9434214);
        smsNotificacao.estado();
    }
}
