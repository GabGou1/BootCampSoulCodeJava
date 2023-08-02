package Main.Java.aula280723;
import java.util.Scanner;

public class Atividade280723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu email:");
        String email = sc.nextLine();

        System.out.println("Digite sua senha:");
        String senha = sc.nextLine();

        if (!email.contains("@soulcode.com") || senha.length() >= 9){
            System.out.println("Email, ou senha inválidos!");
        }

        int vetor1[] = {1, 2, 3, 4, 5};
        int vetor2[] = {6, 7, 8, 9, 0};

        int vetorFinal[] = new int[5];
        for (int i = 0; i < vetorFinal.length; i++) {
            vetorFinal[i] = vetor1[i] + vetor2[i];
            System.out.println(vetorFinal[i]);
        }
    }
}
