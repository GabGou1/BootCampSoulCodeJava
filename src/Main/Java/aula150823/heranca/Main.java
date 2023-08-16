package Main.Java.aula150823.heranca;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produto batata = new Produto("Batata", 8.5, "124332");
        System.out.println(batata.getCodigo());
        System.out.println(batata.getNome());

        Livro senhorDosAneis = new Livro();
    }
}
