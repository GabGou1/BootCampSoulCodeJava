package Main.Java.aula040823.Banco;

import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Conta criarConta(Cliente cliente){
        Conta conta = new Conta((int)(Math.random() * 10), 0.0, cliente);
        return conta;
    }
    public Conta buscarConta(Integer numeroDaConta){
        for (Conta conta : contas) {
            if (conta.getNumeroDaConta().equals(numeroDaConta)){
                return conta;
            }
        }
        return null;
    }

    public Banco() {}
    public Banco(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "contas=" + contas +
                '}';
    }
}
