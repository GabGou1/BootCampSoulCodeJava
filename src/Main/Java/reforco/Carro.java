package Main.Java.reforco;

import javax.xml.crypto.Data;
import java.util.Date;

public class Carro {
    private String marca;
    private String modelo;
    private Date ano;
    private Boolean motor = false;

    public Carro() {
    }
    public Carro(String marca, String modelo, Date ano) {
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

    public Date getAno() {
        return ano;
    }
    public void setAno(Date ano) {
        this.ano = ano;
    }

    public String getMotor() {
        String estado = "";
        if (motor){
            estado = "ligado";
        }
        else {
            estado = "desligado";
        }
        return "Seu motor está " + estado;
    }
    public void setMotor(Boolean motor) {
        this.motor = motor;
    }

    public void estadoMotor(){
        motor = !motor;
    }
}
