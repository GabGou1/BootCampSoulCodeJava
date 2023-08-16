package Main.Java.aula150823.atividade.veiculos;

import java.time.LocalDate;

public class Carro extends Veiculo{
    private Integer numPortas;
    private Integer quantPassageiros;
    private Double capacidadePortaMalas;

    public Carro() {
    }
    public Carro(String marca, String modelo, LocalDate ano, Integer numPortas, Integer quantPassageiros, Double capacidadePortaMalas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
        this.quantPassageiros = quantPassageiros;
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    public Integer getNumPortas() {
        return numPortas;
    }
    public void setNumPortas(Integer numPortas) {
        this.numPortas = numPortas;
    }

    public Integer getQuantPassageiros() {
        return quantPassageiros;
    }
    public void setQuantPassageiros(Integer quantPassageiros) {
        this.quantPassageiros = quantPassageiros;
    }

    public Double getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }
    public void setCapacidadePortaMalas(Double capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }
}
