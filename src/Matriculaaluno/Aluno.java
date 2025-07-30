package Matriculaaluno;

// Classe que representa um aluno
public class Aluno {
    // Atributos do aluno
    private String nome;       // Nome do aluno
    private String matricula;  // Matrícula do aluno
    private String curso;      // Curso do aluno

    // Construtor que recebe nome, matrícula e curso
    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    // Construtor que recebe apenas nome e curso
    // Se a matrícula não for informada, fica como "Não informada"
    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = "Não informada";
    }

    // Método para mostrar os dados do aluno no console
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}
