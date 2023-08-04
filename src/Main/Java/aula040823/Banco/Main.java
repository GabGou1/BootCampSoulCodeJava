package Main.Java.aula040823.Banco;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gabriel", 20, "412143154-2");
        Cliente cliente2 = new Cliente("José", 25, "23534534-6");
        Cliente cliente3 = new Cliente("Maria", 19, "3452421-8");

        Conta conta1 = new Conta(21313, 100.0, cliente1);
        Conta conta2 = new Conta(24321, 250.0, cliente2);
        List<Conta> contas = new ArrayList<Conta>(List.of(conta1, conta2));

        Banco banco = new Banco(contas);
        System.out.println(banco.criarConta(cliente3)); // Cria uma nova conta para um cliente
        System.out.println(banco.buscarConta(21313)); // Busca uma conta no banco, de acordo com o numero
        System.out.println(banco); // Exibe todas as contas do banco

        System.out.println(banco.buscarConta(24321).depositar(150.0)); // Deposita um valor ao saldo do usuário
        System.out.println(banco.buscarConta(21313).sacar(150.0)); // Saca um valor do saldo do usuário
    }
}
