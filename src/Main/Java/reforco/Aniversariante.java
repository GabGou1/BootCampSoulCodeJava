package Main.Java.reforco;

import java.time.LocalDate;
import java.util.Locale;

public class Aniversariante {
    private String nome;
    private LocalDate dataNasc;

    public Aniversariante() {
    }
    public Aniversariante(String nome, LocalDate dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String verificacao(){
        LocalDate hoje = LocalDate.now();
        int diaHoje = hoje.getDayOfMonth();
        int diaDataNasc = dataNasc.getDayOfMonth();
        int mesHoje = hoje.getMonthValue();
        int mesDataNasc = dataNasc.getMonthValue();
        if (diaDataNasc == diaHoje && mesDataNasc == mesHoje){
            return "Parabèns! " + nome + " hoje é seu aniversário!";
        }
        else {
            return "Seu aniversário não é hoje!";
        }
    }
}
