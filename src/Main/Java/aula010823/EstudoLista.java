package Main.Java.aula010823;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EstudoLista {
    public static void main(String[] args) {
        // vetor -> inflexível
        // lista -> flexível

        // generic -> <Integer> <String>...
        List<Integer> numeros = new ArrayList<Integer>(); // conpatível
        numeros.add(9);
        numeros.add(4);
        numeros.add(5);
        numeros.add(8);
        System.out.println(numeros);

        System.out.println(numeros.get(2));
        numeros.remove(2);
        System.out.println(numeros.get(2));
        numeros.add(2, 5);
        System.out.println(numeros.get(2));

        // Wrapper -> Representação de tipo primitivo como Objeto
        // Integer int
        // Double double
        // Boolean boolean
        // Long long
        // Float float

        Collections.sort(numeros); // Ordernar os npumeros
        for (int i=0; i < numeros.size(); i++){
            System.out.print(numeros.get(i));
        }
        System.out.println();
        for (Integer numero : numeros){
            System.out.print(numero);
        }

        System.out.println(); // Quebra de linha

        List<String> nomes = new ArrayList<>(List.of("Sky", "Ludmila", "Leonardo", "Gabriel"));
        Collections.sort(nomes);
        // Imprimir lista ordenada
        for (String nome : nomes){
            System.out.print(nome + " ");
        }
    }
}
