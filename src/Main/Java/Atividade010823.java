package Main.Java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Atividade010823 {
    enum EstacoesDoAno{
        VERAO,
        OUTONO,
        INVERNO,
        PRIMAVERA
    }
    public static String Estacao(LocalDate dataEscolhida){
        Integer mes = dataEscolhida.getMonthValue();
        if (mes == 12 || mes == 1 || mes == 2){
            return "O mês atual é parte da estação: " + EstacoesDoAno.VERAO;
        }
        else if (mes == 3 || mes == 4 || mes == 5){
            return "O mês atual é parte da estação: " + EstacoesDoAno.OUTONO;
        }
        else if(mes == 6 || mes == 7 || mes == 8){
            return "O mês atual é parte da estação: " + EstacoesDoAno.INVERNO;
        }
        else if (mes == 9 || mes == 10 || mes == 11) {
            return "O mês atual é parte da estação: " + EstacoesDoAno.PRIMAVERA;
        }
        else {
            return "Mês inexistente";
        }
    }

    public static String afterThreeWeeks(){
        LocalDate hoje = LocalDate.now();
        LocalDate hojeTresSemanas = hoje.plusWeeks(3);
        DateTimeFormatter hojeFormatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = hojeTresSemanas.format(hojeFormatado);
        return dataFormatada;
    }

    public static Boolean primo(Integer numero){
        if (numero > 1 && numero % 2 != 0){
            return true;
        }
        else if(numero == 2){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Digite cinco números para sua lista:");
        for (int i = 0; i < 5; i++) {
            numeros.add(sc.nextInt());
        }

        Collections.sort(numeros);
        System.out.println("O menor número é " + numeros.get(0));
        System.out.println("O maior número é " + numeros.get(4));

        Double media = 0.0;
        for (int i = 0; i < numeros.size(); i++) {
            media = media + numeros.get(i);
        }
        media = media/numeros.size();
        System.out.println("A média dos numeros digitados é " + media);

        System.out.println("Daqui a três semanas será dia " + afterThreeWeeks());

        System.out.println("Digite um número para verificar se ele é primo:");
        Integer numero = sc.nextInt();
        System.out.println(primo(numero));

        System.out.println("Digite um mês para saber qual será a estação do ano: (YYYY/MM/dd)");
        LocalDate dataEscolhida = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println(Estacao(dataEscolhida));
    }
}
