package Main.Java.aula150823.atividade.notificações;

public class SMSNotificacao implements Notificavel{
    private Integer numEmissor;
    private Integer numRemetente;

    public SMSNotificacao() {
    }
    public SMSNotificacao(Integer numEmissor, Integer numRemetente) {
        this.numEmissor = numEmissor;
        this.numRemetente = numRemetente;
    }

    public Integer getNumEmissor() {
        return numEmissor;
    }
    public void setNumEmissor(Integer numEmissor) {
        this.numEmissor = numEmissor;
    }

    public Integer getNumRemetente() {
        return numRemetente;
    }
    public void setNumRemetente(Integer numRemetente) {
        this.numRemetente = numRemetente;
    }

    @Override
    public void estado(){
        System.out.println("Apagado!");
    }
}
