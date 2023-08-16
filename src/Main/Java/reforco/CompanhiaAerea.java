package Main.Java.reforco;

public class CompanhiaAerea {
    enum Servico{
        ECONOMICA,
        EXECUTIVA,
        PRIMEIRA_CLASSE
    }

    private String nome;
    private String paisOrigem;
    private Servico classeServico;

    public CompanhiaAerea() {
    }
    public CompanhiaAerea(String nome, String paisOrigem, Servico classeServico) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.classeServico = classeServico;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }
    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public Servico getClasseServico() {
        return classeServico;
    }
    public void setClasseServico(Servico classeServico) {
        this.classeServico = classeServico;
    }

    @Override
    public String toString() {
        return "CompanhiaAerea{" +
                "nome='" + nome + '\'' +
                ", paisOrigem='" + paisOrigem + '\'' +
                ", classeServico=" + classeServico +
                '}';
    }
}
