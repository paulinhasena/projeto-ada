package Exercicioloja;

public class CarrinhoNormal extends CarrinhoAbstrato implements ICarrinho {

    public CarrinhoNormal() {
        super();
    }

    @Override
    public void adicionarProduto(Produto p) {
        super.lista.add(p);
    }

    @Override
    public void totalizarPedido() {
        totalPedido = 0;
        for (Produto p: lista) {
            totalPedido += p.getPreco();
        }
        numParcelas = 5;
        frete = 30.00;
    }



}
