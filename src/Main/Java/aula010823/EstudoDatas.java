package Main.Java.aula010823;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EstudoDatas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Ano " + dataHoraAtual.getYear());
        System.out.println("Mês " + dataHoraAtual.getMonthValue());
        System.out.println("Dia " + dataHoraAtual.getDayOfMonth());
        System.out.println(dataHoraAtual.getDayOfWeek());

        int ano = 2023;
        int mes = 12;
        int dia = 7;
        LocalDate dataValida = LocalDate.of(ano, mes, dia);
        System.out.println(dataValida);

        LocalDate amanha = LocalDate.of(2023, 8, 2);
        if (hoje.isAfter(amanha)){
            System.out.println("A data já passou!");
        }
        else {
            System.out.println("A data ainda não aconteceu!");
        }

        hoje.isAfter(amanha); // Verifica se hoje já passou da data
        hoje.isBefore(amanha); // Verifica se hoje ainda não passou da data

        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraAtualFormatada = dataHoraAtual.format(formatoBr);
        System.out.println(dataHoraAtualFormatada);
    }
}
