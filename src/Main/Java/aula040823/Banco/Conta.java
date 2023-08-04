package Main.Java.aula040823.Banco;

import java.util.Stack;

public class Conta {
    private Integer numeroDaConta;
    private Double saldo;
    private Cliente cliente;

    public String depositar(double valor){
        saldo += valor;
        return "Valor depositado, seu saldo atual é de " + saldo;
    }
    public String sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            return "Valor sacado, seu saldo atual é de " + saldo;
        }
        else {
            return "Saldo insuficiente, seu saldo atual é de " + saldo;
        }
    }

    public Conta() {}
    public Conta(Integer numeroDaConta, Double saldo, Cliente cliente) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroDaConta=" + numeroDaConta +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
