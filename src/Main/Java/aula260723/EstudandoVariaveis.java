package Main.Java.aula260723;
    // Variável = container de dados
    // tipagem forte = definir o tipo de cada variável
public class EstudandoVariaveis {
    public static void main (String [] args) {
        // Para definir uma variável
        // <tipo> <nome> = <valor>;

        // Tipos primitivos (surgiram com a linguagem) - int, long, char, boolean, double, float
        // Tipos não primitivos (foram implementados depois) - String, List

        // Como declarar variáveis
        int estoque = 150; // Até 2 bilhões

        // L no fim do numero é um sufixo para representar long
        long populacaoTerra = 7900000000L; // Até a casa dos quintilhões

        float precoGasolina = 29.99F; // Até 7 casas de precisão
        double salarioDev = 5999.99; // Até 15 casas de precisão

        boolean ativo = false; // true, false

        String nome = "Gabriel Riberi Koa";
        char primeiraLetra = 'G';

        System.out.println("Estoque: " + estoque);
        System.out.println("População da terra: " + populacaoTerra);
        System.out.println("Meu nome é " + nome);
    }
}
