package Main.Java.aula150823.polimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal gato = new Gato("Gato", "Felino", "Urbano", "Preto");
        System.out.println(gato.getEspecie());

        Animal guanyu = new Gato("Guan Yu", "Falino", "Urbano", "Rajado");
        guanyu.emitirSom();

        Animal doug = new Cachorro("Doug", "Cachorro", "Urbano", "Golden");
        doug.emitirSom();
    }
}
