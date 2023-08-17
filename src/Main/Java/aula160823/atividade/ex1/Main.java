package Main.Java.aula160823.atividade.ex1;

public class Main {
    public static void main(String[] args) {
        Event evento = new Event();
        Integer alugar1 = 23;
        Integer alugar2 = 52;

        evento.verificarVaga(alugar1);
        evento.verificarVaga(alugar2);
    }
}
