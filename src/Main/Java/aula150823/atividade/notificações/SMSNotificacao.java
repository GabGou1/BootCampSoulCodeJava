package Main.Java.aula150823.atividade.notificações;

import java.time.LocalDate;

public class SMSNotificacao extends Notificavel{
    private Integer numEmissor;
    private Integer numRemetente;

    public SMSNotificacao() {
    }
    public SMSNotificacao(LocalDate data, Verificado verificado, Integer numEmissor, Integer numRemetente) {
        super(data, verificado);
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
