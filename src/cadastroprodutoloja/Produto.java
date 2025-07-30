package cadastroprodutoloja;

// Classe Produto, usada para cadastrar e gerenciar produtos
public class Produto {
    private String nome;      // Nome do produto
    private double preco;     // Preço do produto
    private int estoque;      // Quantidade disponível em estoque

    // Construtor que recebe nome, preço e estoque inicial
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Construtor que recebe só nome e preço, estoque começa em 0
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }

    // Método para aumentar o estoque do produto
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) { // Só adiciona se a quantidade for maior que zero
            this.estoque += quantidade;
        }
    }

    // Método para vender uma quantidade do produto
    public boolean vender(int quantidade) {
        // Só vende se tiver estoque suficiente e quantidade positiva
        if (quantidade > 0 && this.estoque >= quantidade) {
            this.estoque -= quantidade;
            return true; // Venda feita
        }
        return false; // Não foi possível vender
    }

    // Mostra as informações do produto no console
    public void exibirResumo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque + " unidades");
    }
}
