package Exercicioloja;

public class Loja {
    public static void main(String[] args) {

        ICarrinho ic = new CarrinhoNormal();
        ic.adicionarProduto(new Produto(1, "Computador", 1500));
        ic.adicionarProduto(new Produto(2, "Monitor", 300));
        ic.adicionarProduto(new Produto(3, "Teclado", 100));
        ic.adicionarProduto(new Produto(4, "Mouse", 50));

        ic.totalizarPedido();

        System.out.println(ic);
    }
}
