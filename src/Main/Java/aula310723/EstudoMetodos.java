package Main.Java.aula310723;

class Garrafa{
    float volume;
    public float obterVolume() {
        return this.volume;
    }

    public Garrafa(float volume) {
        this.volume = volume;
    }
}

public class EstudoMetodos {
    public String bemVindo(String nome){
        return "Bem vindo, " + nome + "!";
    }
    public void imprimir(String texto){
        System.out.println(texto);
    }

    public static double soma(double n1, double n2, double n3){
        double s = n1 + n2 + n3;
        return s;
    }

    public static void main(String[] args) {
        double resultado = soma(10.5, 5.5, 4.0);
        System.out.println(resultado);

        Garrafa garrafa = new Garrafa(1.5F);
        float volumeGarrafa = garrafa.obterVolume();
        System.out.println(volumeGarrafa + " Litros");
    }
}
