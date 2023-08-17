package Main.Java.aula160823.atividade.ex1;

import java.lang.reflect.Array;

public class Event {
    private Integer[] lugaresDisponiveis = new Integer[50];

    public Event() {
    }
    public Event(Integer[] lugaresDisponiveis) {
        this.lugaresDisponiveis = lugaresDisponiveis;
    }

    public Integer[] getLugaresDisponiveis() {
        return lugaresDisponiveis;
    }
    public void setLugaresDisponiveis(Integer[] lugaresDisponiveis) {
        this.lugaresDisponiveis = lugaresDisponiveis;
    }

    public void verificarVaga(Integer lugarEscolhido){
        try {
            lugaresDisponiveis[lugarEscolhido] = 1;
            System.out.println("Alugado!");
        }
        catch (Exception ex){
            throw new NoMoreSeatsException("Lugar indisponível");
        }
    }
}
