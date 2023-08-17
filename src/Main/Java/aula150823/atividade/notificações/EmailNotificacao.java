package Main.Java.aula150823.atividade.notificações;

public class EmailNotificacao implements Notificavel{
    private String emissor;
    private String remetente;

    public EmailNotificacao() {
    }
    public EmailNotificacao(String emissor, String remetente) {
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
