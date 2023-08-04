package Main.Java.aula040823.cursos;

import java.util.ArrayList;
import java.util.List;

public class EstudoComposicao {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Thais", "435523412");
        Aluno aluno2 = new Aluno("Carlos", "35235342523");
        Aluno aluno3 = new Aluno("Diego", "123132113");
        List<Aluno> alunos = new ArrayList<Aluno>(List.of(aluno1, aluno2, aluno3));
        Professor professor = new Professor("Almir", "423423542-1");

        Curso curso = new Curso("Java", 200.0F, professor, alunos);
        System.out.println(curso.getProfessor().getNome());
        System.out.println(curso.getAlunos().get(2).getNome());
    }
}
