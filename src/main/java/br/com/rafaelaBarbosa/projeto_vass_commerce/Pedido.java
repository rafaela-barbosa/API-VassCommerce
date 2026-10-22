package br.com.rafaelaBarbosa.projeto_vass_commerce;

import br.com.rafaelaBarbosa.projeto_vass_commerce.cliente.Cliente;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private long id;
    private LocalDateTime dataCadastro;
    private float valorTotal;
    private PedidoStatus statusAtual;
    private List<ItemPedido> itensPedido;
    @JsonIgnore
    private Cliente cliente;
    @JsonIgnore
    private List<Pagamento> pagamentos;

    public Pedido() {}

    public Pedido(Cliente cliente, List<ItemPedido> itensPedido) {
        this.statusAtual = statusAtual;
        this.cliente = cliente;
        this.itensPedido = (itensPedido != null) ? itensPedido : new ArrayList<>();
        this.pagamentos = new ArrayList<>();
        this.dataCadastro = LocalDateTime.now();
        this.valorTotal = calcularValorTotal();
        this.statusAtual = PedidoStatus.AGUARDANDO_PAGAMENTO;
    }

    public PedidoStatus getStatusAtual() {
        return statusAtual;
    }

    public void setStatusAtual(PedidoStatus statusAtual) {
        this.statusAtual = statusAtual;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    private float calcularValorTotal() {
        float total = 0.0f;
        for (ItemPedido item : this.itensPedido) {
            total += (item.getValorUnitario() * item.getQuantidade());
        }
        return total;
    }

    public void adicionarItem(ItemPedido item) {
        if (item != null) {
            this.itensPedido.add(item);
            this.valorTotal += (item.getValorUnitario() * item.getQuantidade());
        }
    }
}
