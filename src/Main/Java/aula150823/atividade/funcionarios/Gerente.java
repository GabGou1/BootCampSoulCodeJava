package Main.Java.aula150823.atividade.funcionarios;

public class Gerente extends Funcionario{
    private String nome;
    private Integer nivelAcesso;

    public Gerente() {
    }
    public Gerente(String email, String senha, String nome, Integer nivelAcesso) {
        super(email, senha);
        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivelAcesso() {
        return nivelAcesso;
    }
    public void setNivelAcesso(Integer nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}
