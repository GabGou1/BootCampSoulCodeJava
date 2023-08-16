package Main.Java.aula150823.atividade.veiculos;

import java.time.LocalDate;

public class Moto extends Veiculo{
    private String estilo;
    private String tipoGuidao;

    public Moto() {
    }
    public Moto(String marca, String modelo, LocalDate ano, String estilo, String tipoGuidao) {
        super(marca, modelo, ano);
        this.estilo = estilo;
        this.tipoGuidao = tipoGuidao;
    }

    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipoGuidao() {
        return tipoGuidao;
    }
    public void setTipoGuidao(String tipoGuidao) {
        this.tipoGuidao = tipoGuidao;
    }
}
