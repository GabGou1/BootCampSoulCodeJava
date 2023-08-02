package Main.Java.aula260723;

public class EstudoOperadores {
    public static void main (String [] args){
        // Operadores matemáticos
        int a = 10;
        int b = 5;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;

        double divisao = a / b; // Divisão entre dois inteiros -> inteiro
        // Para o valor resultar em um double, é necessário que os dois numeros sejam double

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        double x = Math.pow(2, 2);
        double y = Math.sqrt((144));
        System.out.println(x);
        // Incremento e decremento
        int valor = 5;
        valor++;
        valor--;
        valor += 10;

        // Operadores relacionais (>, <, >=, <=, ==, !=)
        boolean teste1 = a > b;
        boolean teste2 = a < b;
        boolean teste3 = 5 == 5;
        boolean teste4 = 4 != 5;
        boolean teste5 = 6 >= 5;
        boolean teste6 = 5 <= 5;

        // Operadores lógicos (&&, ||, !)
        boolean teste7 = true && false;
        boolean teste8 = true || false;
        boolean teste9 = (5 > 10) && (8 < 4);
        boolean teste10 = (5 > 10) || (8 < 4);
        boolean teste11 = !teste1;

        /*
        Exercício 1
        Crie duas variáveis: peso e altura
        calcule o IMC = peso / (altura * altura)
        monstra na tela o IMC
        */
        double altura = 1.90;
        double peso = 80.5;
        double IMC = peso / Math.pow(altura, 2);
        System.out.println(IMC);
    }
}
