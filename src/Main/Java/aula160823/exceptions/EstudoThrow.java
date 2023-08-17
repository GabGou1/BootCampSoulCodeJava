package Main.Java.aula160823.exceptions;

import Main.Java.aula160823.exceptions.personalizadas.EmailMalFormatado;

public class EstudoThrow {
    public static void setIdade(Integer idade) {
        if(idade < 0){
            // Lançamento de ero
            throw new IllegalArgumentException();
        }
        System.out.println("Idade setada: " + idade);
    }

    public static void validarEmail(String email) {
        if (email == null){
            throw new NullPointerException();
        }
        if (email.isBlank() || !email.contains("@")){
            throw new EmailMalFormatado();
        }
        if (email.length() > 255){
            throw new RuntimeException();
        }
        System.out.println("Email válido!");
    }

    public static void main(String[] args) {
        try {
            setIdade(12);
        }
        catch (IllegalArgumentException ex){
            System.out.println("Digite uma idade válida!");
        }

        try {
            validarEmail("gabrielriberikoagmail.com");
        }
        catch (EmailMalFormatado | NullPointerException ex){
            System.out.println("Email inválido!");
        }
        catch (RuntimeException ex){
            System.out.println("Email muito longo!");
        }
    }
}
