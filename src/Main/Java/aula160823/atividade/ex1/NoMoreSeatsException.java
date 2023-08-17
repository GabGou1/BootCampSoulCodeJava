package Main.Java.aula160823.atividade.ex1;

public class NoMoreSeatsException extends RuntimeException{
    public NoMoreSeatsException() {
    }
    public NoMoreSeatsException(String mensage) {
        super(mensage);
    }
}
