package academy.devdojo.maratonajava.javacore.Gassociacao.test.exercicioTest;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.Seminario;

public class ExercicioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua jk");
        Aluno aluno = new Aluno("Helton", 21);
        Professor professor = new Professor("João Nascimento", "Ciência da computação");

        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("IA generativa", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();




    }
}
