package Main.Java.aula150823.atividade.funcionarios;

public class Desenvolvedor extends Funcionario{
    private String nome;
    private Double horasTrabalhadas;

    public Desenvolvedor() {
    }
    public Desenvolvedor(String email, String senha, String nome, Double horasTrabalhadas) {
        super(email, senha);
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
