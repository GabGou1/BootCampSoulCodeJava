package Main.Java.aula150823.atividade.veiculos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Carro mustang = new Carro("Ford", "Mustang", LocalDate.of(2023, 12, 31), 4, 2, 12.5);
        System.out.println(mustang.getModelo());
    }
}
