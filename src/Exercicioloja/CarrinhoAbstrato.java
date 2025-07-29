package Exercicioloja;

import java.util.ArrayList;

public abstract class CarrinhoAbstrato {
    protected ArrayList<Produto> lista;
    protected int numParcelas;
    protected double totalPedido;
    protected double frete;

    public CarrinhoAbstrato() {
        this.lista = new ArrayList<Produto>();
    }

    public String toString() {
        String res = "Pedido: \n"+
                "  Total: R$ "+String.format("%.2f\n", totalPedido) +
                "  Frete: R$ "+String.format("%.2f\n", frete) +
                "  Parcelas: "+numParcelas+"\n"+
                "  Produtos : \n";
        for (Produto p: lista) {
            res += "           "+p+"\n";
        }
        return res;
    }
}