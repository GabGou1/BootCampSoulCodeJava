package Main.Java.reforco;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private ArrayList<Contato> contatoes;

    public Agenda() {
    }
    public Agenda(ArrayList<Contato> contatoes) {
        this.contatoes = contatoes;
    }

    public ArrayList<Contato> getContatos() {
        return contatoes;
    }
    public void setContatos(ArrayList<Contato> contatoes) {
        this.contatoes = contatoes;
    }

    public ArrayList<Contato> criarContato(String nome, String numero, String email){
        Contato novoContato = new Contato(nome, numero, email);
        ArrayList<Contato> listaContato = new ArrayList<>(List.of(novoContato));
        return listaContato;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Agenda:\n");

        for (Contato contato : contatoes) {
            sb.append("Nome: ").append(contato.getNome()).append("\n");
            sb.append("Número: ").append(contato.getNumero()).append("\n");
            sb.append("Email: ").append(contato.getEmail()).append("\n");
            sb.append("\n");
        }
        return sb.toString();
    }
}
