package Main.Java.aula020823;

public class EstudoClasses {
    public static void main(String[] args) {
        // POO (Programação Orientada a Objeto)
        // Classes -> Fruta
        // Objetos -> Maçã, Pera, Banana
        // Instância -> Processo que constrói um objeto a partir de uma classe
        // Atributo/Propriedade -> Um valor definido na classe incorporado no objeto
        // Métodos/Funções -> Uma rotina/procedimento/

        Fruta maca = new Fruta("Maçã", "Vermelha", 12.5F, true); // Criar/Instanciar um objeto
        maca.amadurecer(60);
        System.out.println(maca.maduro);

        maca.Vitaminas = new String[]{"VitaminaA", "VitaminaB", "VitaminaC"};
        System.out.println(maca.Vitaminas[1]);
    }
}
