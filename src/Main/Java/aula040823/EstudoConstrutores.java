package Main.Java.aula040823;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EstudoConstrutores {
    public static void main(String[] args) {
        List<String> produtos = new ArrayList<String>();
        produtos.add("Sapato");
        produtos.add("Cerveja");
        produtos.add("Livro");
        Venda venda = new Venda(LocalDate.now(), "José", produtos, 299.99);
        System.out.println(venda.getProdutos());

        Venda venda1 = new Venda();
        venda1.setDataRegistro(LocalDate.now());

        System.out.println(venda);
    }
}
