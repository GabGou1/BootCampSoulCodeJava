package Main.Java.aula150823.atividade.veiculos;

import java.time.LocalDate;

public class Veiculo {
    private String marca;
    private String modelo;
    private LocalDate ano;

    public Veiculo() {
    }
    public Veiculo(String marca, String modelo, LocalDate ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getAno() {
        return ano;
    }
    public void setAno(LocalDate ano) {
        this.ano = ano;
    }
}
