package Main.Java.reforco;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

enum MesAno{
    JANEIRO,
    FEVEREIRO,
    MARCO,
    ABRIL,
    MAIO,
    JUNHO,
    JULHO,
    AGOSTO,
    SETEMBRO,
    OUTUBRO,
    NOVEMBRO,
    DEZEMBRO
}

public class Questoes {
    public static Integer fatorial(Integer num){
        Integer result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static String primo(Integer num) {
        if (num <= 1) {
            return "não é primo!";
        }

        if (num <= 3) {
            return "é primo!";
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return "não é primo!";
        }

        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return "não é primo!";
            }
            i += 6;
        }

        return "é primo!";
    }

    public static String media(ArrayList<Integer> array){
        Double resultado = 0.0;
        for (int i = 0; i < array.size(); i++) {
            resultado += array.get(i);
        }
        resultado = resultado / array.size();
        return "A média dos números dentro da ArrayList é de: " + resultado;
    }

    public static String area(Double altura, Double largura){
        Double area = (altura * largura) / 2;
        return "A área do retângulo é " + area;
    }
    public static String perimetro(Double altura, Double largura){
        Double perimetro = (altura * 2) + (largura * 2);
        return "O perímetro do retângulo é de " + perimetro;
    }

    public static String sexta13(LocalDate dataEscolhida){
        LocalDate sextaFeira = dataEscolhida.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        while (sextaFeira.getDayOfMonth() != 13){
            sextaFeira = sextaFeira.plusWeeks(1);
        }
        return "A próxima sexta-feira 13 será na data de " + sextaFeira;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para saber seu fatorial:");
        Integer numero = sc.nextInt();
        System.out.println(fatorial(numero));

        Date dataCriacao = new Date("07/06/2017");
        Carro ncarro = new Carro("Toyota", "Corolla", dataCriacao);
        System.out.println(ncarro.getMarca());
        System.out.println(ncarro.getModelo());
        System.out.println(ncarro.getAno());
        System.out.println(ncarro.getMotor());
        ncarro.estadoMotor();
        System.out.println(ncarro.getMotor());

        LocalDate dataNasc = LocalDate.of(2003, 4, 5);
        Aniversariante Gabgou = new Aniversariante("Gabriel", dataNasc);
        System.out.println(Gabgou.verificacao());

        System.out.println("Digite um número inteiro, para saber se ele é primo: ");
        Integer num = sc.nextInt();
        System.out.println("O numero " + primo(num));

        ArrayList<Integer> lista = new ArrayList<>(List.of(37, 92, 15, 68, 53, 20, 84, 41, 63, 78));
        System.out.println(media(lista));

        System.out.println("Digite as médidas do retângulo: ");
        System.out.print("Altura: ");
        Double altura = sc.nextDouble();
        System.out.print("Largura: ");
        Double largura = sc.nextDouble();
        System.out.println(area(altura, largura));
        System.out.println(perimetro(altura, largura));

        Agenda novaAgenda = new Agenda();
        novaAgenda.setContatos(novaAgenda.criarContato("Gabriel", "345332" , "gabriel@gmail.com"));
        System.out.println("Sua agenda completa: " + novaAgenda);

        System.out.println("Digite alguma data, para saber quanto tempo falta para a próxima sexta-feira 13");
        System.out.print("Dia: ");
        Integer diaProx = sc.nextInt();
        System.out.print("Mês: ");
        Integer mesProx = sc.nextInt();
        System.out.print("Ano: ");
        Integer anoProx = sc.nextInt();
        LocalDate dataProx = LocalDate.of(anoProx, mesProx, diaProx);
        System.out.println(sexta13(dataProx));

        Endereco endereco = new Endereco("Maçambará", "25 e", "Brooklin", "São Paulo", Endereco.Estado.SAOPAULO);
        System.out.println(endereco);

        Telefone telefone = new Telefone(9432142, Telefone.Tipo.CELULAR);
        System.out.println(telefone);

        CompanhiaAerea gol = new CompanhiaAerea("Gol", "EUA", CompanhiaAerea.Servico.PRIMEIRA_CLASSE);
        System.out.println(gol);
    }
}
