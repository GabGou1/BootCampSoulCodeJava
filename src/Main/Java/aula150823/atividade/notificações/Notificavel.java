package Main.Java.aula150823.atividade.notificações;

public interface Notificavel {
    enum Verificado{
        VISTO,
        ENVIADO,
        ENVIANDO
    }

    void estado();
}
