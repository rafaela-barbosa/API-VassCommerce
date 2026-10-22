package br.com.rafaelaBarbosa.projeto_vass_commerce;

import br.com.rafaelaBarbosa.projeto_vass_commerce.cliente.Cliente;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Pagamento {

    private long id;
    private float valorPago;
    private Cartao cartao;
    @JsonIgnore
    private Cliente cliente;
    private Pedido pedido;

    public Pagamento() {}

    public Pagamento(Cliente cliente, Cartao cartao, Pedido pedido, float valorPago) {
        this.cliente = cliente;
        this.cartao = cartao;
        this.pedido = pedido;
        this.valorPago = valorPago;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }
}
