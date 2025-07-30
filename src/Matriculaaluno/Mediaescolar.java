package Matriculaaluno;

import java.util.Scanner;

public class Mediaescolar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pede o nome do aluno e lê do teclado
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();

        // Pede a matrícula do aluno (pode ser deixada em branco)
        System.out.print("Digite a matrícula do aluno (ou pressione Enter para pular): ");
        String matricula = teclado.nextLine();

        // Pede o curso do aluno e lê do teclado
        System.out.print("Digite o curso do aluno: ");
        String curso = teclado.nextLine();

        Aluno aluno;
        // Se a matrícula não foi informada, cria o aluno sem matrícula
        if (matricula.isEmpty()) {
            aluno = new Aluno(nome, curso);
        } else {
            // Se a matrícula foi informada, cria o aluno com todos os dados
            aluno = new Aluno(nome, matricula, curso);
        }

        // Mostra os dados do aluno na tela
        System.out.println("\nDados do aluno:");
        aluno.exibirDados();

        // Pede as duas notas do aluno
        double n1, n2, me;
        System.out.print("\nDigite a N1: ");
        n1 = teclado.nextDouble();
        System.out.print("Digite a N2: ");
        n2 = teclado.nextDouble();

        // Calcula a média das notas
        me = (n1 + n2) / 2;

        // Mostra a média calculada
        System.out.println("Sua média vale " + me);

        // Verifica se o aluno foi aprovado ou não
        if (me >= 6.0) {
            System.out.println("Parabéns, você foi aprovado!");
        } else {
            System.out.println("Oba, nos vemos ano que vem!!");
        }

        teclado.close();
    }
}
