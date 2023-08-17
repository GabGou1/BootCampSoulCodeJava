package Main.Java.aula160823.atividade.ex2;

public class Converter {
    enum MoedaOrigem{
        REAL,
        DOLAR
    }

    private MoedaOrigem moeda;
    private Double real;
    private Double dolar;

    public Converter() {
    }
    public Converter(Double real, Double dolar, MoedaOrigem moeda) {
        this.moeda = moeda;
        this.real = real;
        this.dolar = dolar;
    }

    public MoedaOrigem getMoeda() {
        return moeda;
    }
    public void setMoeda(MoedaOrigem moeda) {
        this.moeda = moeda;
    }

    public Double getReal() {
        return real;
    }
    public void setReal(Double real) {
        this.real = real;
    }

    public Double getDolar() {
        return dolar;
    }
    public void setDolar(Double dolar) {
        this.dolar = dolar;
    }

    public Double converter(MoedaOrigem moeda, Double real, Double dolar){
        if (moeda == MoedaOrigem.REAL){
            return real / 5;
        }
        else {
            return dolar * 5;
        }
    }
}
