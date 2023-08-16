package Main.Java.aula150823.atividade.notificações;

import java.time.LocalDate;

public abstract class Notificavel {
    enum Verificado{
        VISTO,
        ENVIADO,
        ENVIANDO
    }

    private LocalDate data;
    private Verificado verificado;

    public Notificavel() {
    }
    public Notificavel(LocalDate data, Verificado verificado) {
        this.data = data;
        this.verificado = verificado;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public Verificado getVerificado() {
        return verificado;
    }
    public void setVerificado(Verificado verificado) {
        this.verificado = verificado;
    }

    public void estado(){
        System.out.println("Notificação vista!");
    }
}
