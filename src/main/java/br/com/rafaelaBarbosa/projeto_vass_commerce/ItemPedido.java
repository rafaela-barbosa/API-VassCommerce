package br.com.rafaelaBarbosa.projeto_vass_commerce;

import br.com.rafaelaBarbosa.projeto_vass_commerce.produto.Produto;

public class ItemPedido {

    private long id;
    private int quantidade;
    private float valorUnitario;
    private Produto produto;

    public ItemPedido() {}

    public ItemPedido(Produto produto, int quantidade, float valorUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        if (produto != null) {
            this.valorUnitario = produto.getValorUnitario();
        }
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
