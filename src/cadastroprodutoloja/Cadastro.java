package cadastroprodutoloja;

public class Cadastro {
    public static void main(String[] args) {
        // Instancia um produto já com nome, preço e quantidade em estoque
        Produto p1 = new Produto("mause lecoo usb", 32.90, 101);

        // Instancia outro produto, mas só com nome e preço (estoque começa em 0)
        Produto p2 = new Produto("fone sem fio jbl", 99.90);

        // Acrescenta 5 unidades ao estoque do primeiro produto
        p1.adicionarEstoque(5);

        // Acrescenta 20 unidades ao estoque do segundo produto
        p2.adicionarEstoque(20);

        // Realiza a venda de 3 unidades do primeiro produto
        p1.vender(3);

        // Realiza a venda de 5 unidades do segundo produto
        p2.vender(5);

        // Mostra as informações atualizadas do primeiro produto
        p1.exibirResumo();

        // Mostra as informações atualizadas do segundo produto
        p2.exibirResumo();
    }
}
