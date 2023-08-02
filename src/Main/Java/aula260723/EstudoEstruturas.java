package Main.Java.aula260723;
import java.util.Scanner;

public class EstudoEstruturas {
    public static void main(String[] args) {
        // Scanner = vai permitir a leitura de dados do teclado
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine(); // Aguarda o usuário digitar

        System.out.println("Oi " + nome);

        // Leia o peso da pessoa
        // Calcule o IMC
        // Verifique a situação do IMC calculado com
        // base em https://www.saude.rj.gov.br/obesidade/calcule-seu-imc

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        double IMC = peso / Math.pow(altura, 2);
        if (IMC < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (IMC >= 17 && IMC < 18.49) {
            System.out.println("Abaixo do peso");
        } else if (IMC >= 18.5 && IMC < 24.99) {
            System.out.println("Peso normal");
        } else if (IMC >= 25 && IMC < 29.99) {
            System.out.println("Acima do peso");
        } else if (IMC >= 30 && IMC < 34.99) {
            System.out.println("Obesidade I");
        } else if (IMC >= 35 && IMC < 39.99) {
            System.out.println("Obesidade II (severa)");
        } else if (IMC >= 40) {
            System.out.println("Obesidade II (mórbida)");
        } else {
            System.out.println("IMC não existe.");
        }

        // Ternário
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        String mensagem = (idade >= 18) ? "Você é maior de idade" : "Você é menor de idade";
        System.out.println(mensagem);

        // Repetição
        // Início
        // condição de parada
        // atualização do valor
        System.out.println("Quantas batatas você come por dia?");
        int total = sc.nextInt();

        for (int i = 0; i < total; i++) {
            System.out.println("Você gosta de batata!");
        }

        int i = 0;
        // Exercício: Crie uma versão com while do código
        while (i < total){
            System.out.println("Você gosta de batata!");
            i++;
        }

        int j = 0;
        do {
            System.out.println("Você gosta de batata!");
            j++;
        }while (j < total);
    }
}