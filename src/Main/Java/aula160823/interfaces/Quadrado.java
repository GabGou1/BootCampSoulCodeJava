package Main.Java.aula160823.interfaces;

public class Quadrado implements Forma{
    private Double base;
    private Double altura;

    public Quadrado() {
    }
    public Quadrado(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }
    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double calcularArea(){
        return base * altura;
    }

    @Override
    public Double calcularPerm(){
        return (base * 2) + (altura * 2);
    }
}
