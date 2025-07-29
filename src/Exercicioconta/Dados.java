package Exercicioconta;

public class Dados {
    private int numero;
    private int digito;
    private String nome;
    private String cpf;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    void informacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Conta: " + numero + "-" + digito);
        System.out.println("CPF: " + cpf + "\n");
    }

    public boolean sacar(double valor) {
        if (saldo < valor) {
            boolean retirar = false;
            System.out.println("Você não pode sacar um valor maior que seu saldo");
        } else {
            boolean retirar = true;
            saldo -= valor;
        }
        return false;
    }
}
