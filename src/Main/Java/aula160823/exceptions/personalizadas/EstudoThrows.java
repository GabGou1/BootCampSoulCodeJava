package Main.Java.aula160823.exceptions.personalizadas;

public class EstudoThrows {
    public static void validarCPF(String cpf) throws Exception{
        if (cpf.length() != 11){
            throw new IllegalArgumentException();
        }
        System.out.println("CPF válido");
    }
    public static void main(String[] args) {
        try {
            validarCPF("14143421123");
        }
        catch (Exception ex){
            System.out.println("CPF inválido");
        }
    }
}
