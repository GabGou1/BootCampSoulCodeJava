package Main.Java.aula150823.atividade.funcionarios;

import java.time.LocalDate;

public class Atendente extends Funcionario{
    private String nome;
    private LocalDate diaFolga;

    public Atendente() {
    }
    public Atendente(String email, String senha, String nome, LocalDate diaFolga) {
        super(email, senha);
        this.nome = nome;
        this.diaFolga = diaFolga;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDiaFolga() {
        return diaFolga;
    }
    public void setDiaFolga(LocalDate diaFolga) {
        this.diaFolga = diaFolga;
    }
}
