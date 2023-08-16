package Main.Java.reforco;

public class Telefone {
    enum Tipo{
        CASA,
        TRABALHO,
        CELULAR
    }

    private Integer numTelefone;
    private Tipo tipo;

    public Telefone() {
    }
    public Telefone(Integer numTelefone, Tipo tipo) {
        this.numTelefone = numTelefone;
        this.tipo = tipo;
    }

    public Integer getNumTelefone() {
        return numTelefone;
    }
    public void setNumTelefone(Integer numTelefone) {
        this.numTelefone = numTelefone;
    }

    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "numTelefone=" + numTelefone +
                ", tipo=" + tipo +
                '}';
    }
}
