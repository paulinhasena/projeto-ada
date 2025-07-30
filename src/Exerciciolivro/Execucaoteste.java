package Exerciciolivro;

public class Execucaoteste {
    public static void main(String[] args) {
        // Cria o primeiro livro e define seus dados
        Livro livro1 = new Livro();
        livro1.setTitulo("Livro Fundamentos De Engenharia De Dados");
        livro1.setAutor("Joe Reis, Matt Housley");
        livro1.setAno(2023);
        livro1.setCategoria("Tecnologia");
        livro1.setPosicao("Estante 5, Prateleira 7");
        livro1.setDisponivel(true);

        // Cria o segundo livro e define seus dados
        Livro livro2 = new Livro();
        livro2.setTitulo("O Pequeno Príncipe");
        livro2.setAutor("Antoine de Saint-Exupéry");
        livro2.setAno(1943);
        livro2.setCategoria("Literatura");
        livro2.setPosicao("Estante 2, Prateleira 3");
        livro2.setDisponivel(false);

        // Mostra as informações do primeiro livro
        System.out.println("Informações do Livro 1:");
        livro1.exibir();

        // Mostra as informações do segundo livro
        System.out.println("\nInformações do Livro 2:");
        livro2.exibir();
    }
}