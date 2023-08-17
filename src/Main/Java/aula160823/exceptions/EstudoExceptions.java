package Main.Java.aula160823.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstudoExceptions {
    static List<String> strings = new ArrayList();

    static void addNaLista(String texto){
        strings.add(texto);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um numero: ");
            Integer numero = sc.nextInt();
            System.out.println(numero);
        }
        catch (Exception ex){
            System.out.println("DiGITE UM NUMERO!");
        }
        addNaLista("Texto de Exemplo");
        System.out.println(strings);
    }
}
