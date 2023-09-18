package ProgOrientadaObjetos;

public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Curso curso1 = new Curso();
        Participacao participacao = new Participacao();

        curso1.matriculados = 14230;

        participacao.aluno = aluno1;
        participacao.aluno.nome = "Fulano";
        participacao.aluno.matricula = 40028922;
        participacao.aluno.email = "email@etc.tal";
        participacao.aluno.curso = curso1;

        participacao.curso = curso1;
    }

}