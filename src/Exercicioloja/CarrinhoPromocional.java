package Exercicioloja;

public class CarrinhoPromocional extends CarrinhoAbstrato implements ICarrinho {
    private double desconto;


    @Override
    public void adicionarProduto(Produto p) {
        super.lista.add(p);

    }

    @Override
    public void totalizarPedido() {
        super.totalPedido = 0.0;
        for (Produto p : super.lista) {
            super.totalPedido += p.getPreco();
        }

        if (totalPedido >= 1500) {
            frete = 0;
            numParcelas = 10;
        }
        else {
            frete = 20;
            numParcelas = 5;
        }
    }
}
