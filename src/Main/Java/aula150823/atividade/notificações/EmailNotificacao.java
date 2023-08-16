package Main.Java.aula150823.atividade.notificações;

import java.time.LocalDate;

public class EmailNotificacao extends Notificavel{
    private String emissor;
    private String remetente;

    public EmailNotificacao() {
    }
    public EmailNotificacao(LocalDate data, Verificado verificado, String emissor, String remetente) {
        super(data, verificado);
        this.emissor = emissor;
        this.remetente = remetente;
    }

    public String getEmissor() {
        return emissor;
    }
    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public String getRemetente() {
        return remetente;
    }
    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    @Override
    public void estado(){
        System.out.println("Enviado!");
    }
}
