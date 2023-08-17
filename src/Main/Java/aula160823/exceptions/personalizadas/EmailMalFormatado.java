package Main.Java.aula160823.exceptions.personalizadas;

public class EmailMalFormatado extends RuntimeException{
    public EmailMalFormatado() {
    }

    public EmailMalFormatado(String mensage) {
        super(mensage);
    }
}
