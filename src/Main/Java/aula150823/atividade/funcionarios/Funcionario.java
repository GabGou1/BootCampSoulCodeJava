package Main.Java.aula150823.atividade.funcionarios;

public abstract class Funcionario {
    private String email;
    private String senha;

    public Funcionario() {
    }
    public Funcionario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
