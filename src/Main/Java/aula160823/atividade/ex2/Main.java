package Main.Java.aula160823.atividade.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao conversor de REAL para DOLAR e vice-versa");
        System.out.println("Escolha qual a SUA moeda: ");
        System.out.println("1 - REAL // 2 - DOLAR");

        Integer moedaEscolhida = sc.nextInt();
        Converter converter = new Converter();
        if (moedaEscolhida == 1){
            converter.setMoeda(Converter.MoedaOrigem.REAL);
        }
        else if (moedaEscolhida == 2){
            converter.setMoeda(Converter.MoedaOrigem.DOLAR);
        }
        else {
            throw new ExecptionCoin("Moeda Inválida");
        }

        System.out.println("Quanto você gostaria de converter?");
        Double quantMoeda = sc.nextDouble();
        if (converter.getMoeda() == Converter.MoedaOrigem.REAL){
            converter.setReal(quantMoeda);
        }
        else {
            converter.setDolar(quantMoeda);
        }

        System.out.println("Sua quantidade de dinheiro convertido é de: " + converter.converter(converter.getMoeda(), converter.getReal(), converter.getDolar()));
    }
}
