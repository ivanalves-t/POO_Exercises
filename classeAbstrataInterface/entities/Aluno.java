package classeAbstrataInterface.entities;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public int compareTo(Aluno outroAluno) {
        // Para ordenar de forma decrescente por nota
        return Double.compare(outroAluno.getNota(), this.getNota());
    }

    @Override
    public String toString() {
        return nome + " - " + nota;
    }
}
