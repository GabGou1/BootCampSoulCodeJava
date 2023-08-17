package Main.Java.aula150823.atividade.funcionarios;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("gerente@gmail.com", "gc5t34c", "Paulo", 1);
        Gerente g = (Gerente) gerente;
        System.out.println(g.getNome());

        Funcionario atendente = new Atendente("atendente@gmail.com", "43tu34n", "Mariana", LocalDate.now());
        Atendente a = (Atendente) atendente;
        System.out.println(a.getNome());

        Funcionario desenvolvedor = new Desenvolvedor("desenvolvedor@gmail.com", "3rf2we4f", "Mateus", 6.5);
        Desenvolvedor d = (Desenvolvedor) desenvolvedor;
        System.out.println(d.getHorasTrabalhadas());
    }
}
