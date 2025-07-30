package Exercicioconta;

// Classe que representa os dados de uma conta bancária
public class Dados {
    private int numero;      // Número da conta
    private int digito;      // Dígito da conta
    private String nome;     // Nome do titular
    private String cpf;      // CPF do titular
    private double saldo;    // Saldo da conta

    // Métodos para acessar e alterar o número da conta
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Métodos para acessar e alterar o dígito da conta
    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    // Métodos para acessar e alterar o nome do titular
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos para acessar e alterar o CPF do titular
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método para consultar o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar um valor na conta
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método para mostrar as informações da conta
    void informacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Conta: " + numero + "-" + digito);
        System.out.println("CPF: " + cpf + "\n");
    }

    // Método para sacar um valor da conta
    public boolean sacar(double valor) {
        if (saldo < valor) {
            // Não permite sacar mais do que o saldo disponível
            System.out.println("Você não pode sacar um valor maior que seu saldo");
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }
}
