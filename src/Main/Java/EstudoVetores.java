package Main.Java;
import java.util.Scanner;

public class EstudoVetores {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5}; // Vetor de numeros inteiros
//        System.out.println(nums[4]);
//        nums[4] = 8;
//        System.out.println(nums[4]);
//
//        double[] notas = new double[60]; // Declara um vetor double vazio com 60 posições
//        notas[59] = 5.6;
//        System.out.println(notas[59]); // Não é possível aumentar o número de variáveis de um array em java
//
//        String[] nomes = {"Fernando", "Felipe"}; // Válido
//        String nomes2[] = {"João", "Maria"}; // Válido
//
//        System.out.println(nums); // Não printa o conteúdo do array
//        for (int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//        }
//
//        for(int num : nums){ // Mais legível que o código de cima
//            System.out.println(num);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de notas");
        int nNotas = sc.nextInt();

        double notas[] = new double[nNotas];
        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota:");
            notas[i] = sc.nextDouble();
        }

        double media = 0.0;
        for (double nota : notas){
            media += nota;
        }
        media /= nNotas;
        System.out.printf("A média é igual a %.2f", media);
    }
}