package Exerciciolivro;

// Classe que representa um livro na biblioteca
public class Livro {
    // Atributos do livro
    private String titulo;
    private String autor;
    private int ano;
    private String categoria;
    private String posicao; // Exemplo: "Estante 5, Prateleira 7"
    private boolean disponivel;

    // Métodos para acessar e alterar o título
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Métodos para acessar e alterar o autor
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Métodos para acessar e alterar o ano de publicação
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Métodos para acessar e alterar a categoria do livro
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Métodos para acessar e alterar a posição do livro na estante
    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    // Métodos para saber e definir se o livro está disponível
    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // Método para marcar o livro como emprestado
    void emprestar() {
        disponivel = false;
    }

    // Método para marcar o livro como devolvido
    void devolver() {
        disponivel = true;
    }

    // Método para exibir as informações do livro
    void exibir() {
        System.out.println("Livro: " + titulo + " (" + ano + ")");
        System.out.println("Autor: " + autor);
        System.out.println("Categoria: " + categoria);
        System.out.println("Posição: " + posicao);
        if (disponivel) {
            System.out.println("Livro disponível para empréstimo");
        } else {
            System.out.println("Livro INDISPONÍVEL para empréstimo");
        }
    }
}
