package Main.Java.aula030823;

public class EstudoModificadores {
//    - Acesso
//      -> public (pode ser acessado fora da classe e fora do pacote onde foi criado)
//      -> private (não pode ser acessado fora das classes, somente dentro da própria classe)
//      -> protect (pode ser acessado por classes dentro do mesmo pacote, pela própria classe)
//      -> default (padrão) (acessa somente por classes do mesmo pacote)
//    - Não Acesso
//      -> static (não precisa ser criado um objeto, para acessar)
//      -> final (valor não pode ser alterado)
//      -> void (não tem retorno)
//    - Encapsulamento -> garantir a consistência dos dados de uma classe

    public final double PI = 3.1415; // Criar uma constante

    public static void main(String[] args) {
        Cliente robson = new Cliente("Robson", 45, "512.325");

        System.out.println(robson.getNome());
        System.out.println(robson.getIdade());
        System.out.println(robson.getCpf());
        System.out.println(robson.validarCpf());
        System.out.println(Cliente.validarEmail("gabrielriberikoa@gmail.com"));
    }
}
