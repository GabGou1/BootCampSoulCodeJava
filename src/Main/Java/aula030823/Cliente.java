package Main.Java.aula030823;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private Integer idade;
    private String cpf;
    private String email;
    LocalDate dataNascimento;

    public Cliente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean validarCpf(){return cpf.contains(".");}
    public static boolean validarEmail(String email){
        return email.contains("@");
    }
}
