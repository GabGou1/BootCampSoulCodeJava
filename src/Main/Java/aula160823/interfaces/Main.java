package Main.Java.aula160823.interfaces;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0, 10.0);
        System.out.println(quadrado.calcularArea());

        Triangulo triangulo = new Triangulo(5.0, 8.0);
        System.out.println(triangulo.calcularPerm());
    }
}
