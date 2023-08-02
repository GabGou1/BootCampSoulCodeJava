package Main.Java.aula020823;

public class Fruta {
    String nome;
    String cor;
    float acidez;
    boolean suculez = false;
    boolean maduro = false;
    String[] Vitaminas;

    void amadurecer(int dias){
        maduro = true;
    }

    public Fruta(String nome, String cor, float acidez, boolean suculez) {
        this.nome = nome;
        this.cor = cor;
        this.acidez = acidez;
        this.suculez = suculez;
    }
}
