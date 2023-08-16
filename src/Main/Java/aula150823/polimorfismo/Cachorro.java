package Main.Java.aula150823.polimorfismo;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro() {
    }
    public Cachorro(String nome, String especie, String habitat, String raca) {
        super(nome, especie, habitat);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom(){
        System.out.println("Au, Au");
    }
}
