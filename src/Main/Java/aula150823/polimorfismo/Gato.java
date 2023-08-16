package Main.Java.aula150823.polimorfismo;

public class Gato extends Animal{
    private String corPelo;

    public Gato() {
    }
    public Gato(String nome, String especie, String habitat, String corPelo) {
        super(nome, especie, habitat);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    // sobrecarga de método -> reescrever um método
    @Override // Anotação
    public void emitirSom(){
        System.out.println("Miau");
    }
}
