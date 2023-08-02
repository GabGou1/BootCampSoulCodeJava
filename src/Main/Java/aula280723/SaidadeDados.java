package Main.Java.aula280723;

public class SaidadeDados {
    public static void main (String [] args){
        System.out.println("Hello World!"); // Saída no console
        System.out.print(1); // Não quebra a linha
        System.out.print(2);
        System.out.println(); // Quebra de linha
        System.out.println("Oi\nEu sou Java!");
        System.err.println("Ops! Houve um erro!"); // serr

        int n1 = 7;
        int n2 = 9;
        int soma = n1 + n2;

        System.out.printf("A soma de %d e %d é igual a %d\n", n1, n2, soma); // printf
        // %d mapeia um numero

        String nome = "Gabriel";
        System.out.printf("Bem vindo, %s!\n", nome);
        // %s mapeia uma string

        double num1 = 3.4;
        double num2 = 12.5;
        double div = num1 / num2;
        System.out.printf("A divisão de %.2f e %.2f é igual a %.2f\n", num2, num1, div); // .2 para limitar as casas
        // %f mapeis numeros decimais
    }
}
