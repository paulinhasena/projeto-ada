package Exercicioconta;

import java.util.Scanner;

public class Saldoconta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao, loop = 0, continua;
        Dados dados = new Dados();
        dados.setNome("Paula Sena");
        dados.setNumero(123456);
        dados.setDigito(7);
        dados.setCpf("123.456.789-10");
        dados.informacoes();
        while (loop < 1) {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar valor");
            System.out.println("3 - Sacar valor");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("Saldo = R$ %.2f%n", dados.getSaldo());
                    break;
                case 2:
                    System.out.println("Quanto deseja depositar?");
                    double valor = sc.nextDouble();
                    dados.depositar(valor);
                    System.out.printf("Saldo atual = R$ %.2f%n", dados.getSaldo());
                    loop++;
                    break;
                case 3:
                    System.out.println("Quanto deseja sacar?");
                    double retirar = sc.nextDouble();
                    dados.sacar(retirar);
                    System.out.printf("Saldo atual = R$ %.2f%n", dados.getSaldo());
                    loop++;
                    break;
                default:
                    System.out.println("Opção inválida");
                    loop = 0;
                    continue;
            }
            System.out.println("\nDeseja continuar?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            continua = sc.nextInt();
            switch (continua) {
                case 1:
                    loop = 0;
                    break;
                case 2:
                    System.out.printf("Saldo final = R$ %.2f%n", dados.getSaldo());
                    loop++;
                    break;
                default:
                    System.out.println("Opção inválida");
                    loop = 0;
                    continue;
            }
        }
        sc.close();
    }
}
