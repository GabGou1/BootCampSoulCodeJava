package Main.Java.aula280723;
import java.util.Scanner;

public class EstudandoStrings {
    public static void main(String[] args) {
        // String java = new String("Java");
        String java = "Java"; // um texto é um objeto
        System.out.println(java.toLowerCase()); // minusculo
        System.out.println(java.toUpperCase()); // maiúsculo
        System.out.println(java.charAt(1)); // caracter com base na posição
        System.out.println(java.indexOf("va")); // indice do primeiro caracter da substring
        System.out.println(java.replace("v", "c")); // alterar um caracter
        System.out.println(java.replaceAll("a", "i")); // alterar vários caracteres
        System.out.println(java.substring(2, 4)); // indice inicial, indice final +1

        String nome1 = "Estefane";
        String nome2 = "Stephane";
        System.out.println(nome1 == nome2); // compara os objetos
        System.out.println(nome1.equals(nome2)); // compara as strings dos dois objetos
        System.out.println(nome1.equalsIgnoreCase(nome2)); // compara ignorando o case

        Scanner sc = new Scanner(System.in);
        String texto = "Vamos ao break 10:35";
        System.out.println("Diga uma palavra:");
        String palavra = sc.nextLine();

        if (palavra.isEmpty()){
            System.out.println("Conteúdo vazio!");
        }
        else if (texto.contains(palavra)) {
            System.out.println("Contém!");
        }
        else {
            System.out.println("Não contém!");
        }
        }
    }
