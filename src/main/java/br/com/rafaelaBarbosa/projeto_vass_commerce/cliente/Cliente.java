package br.com.rafaelaBarbosa.projeto_vass_commerce.cliente;

import br.com.rafaelaBarbosa.projeto_vass_commerce.Cartao;
import br.com.rafaelaBarbosa.projeto_vass_commerce.Endereco;
import br.com.rafaelaBarbosa.projeto_vass_commerce.Pedido;
import br.com.rafaelaBarbosa.projeto_vass_commerce.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {

    private LocalDate dataNascimento;
    private String cpf;
    private List<Endereco> enderecos;
    private List<Pedido> pedidos;
    private List<Cartao> cartoes;

    public Cliente() {
        super();
    }

    public Cliente(String nomeCompleto, String email, String senha, String cpf, LocalDate dataNascimento) {
        super(nomeCompleto, email, senha);
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;

        this.enderecos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.cartoes = new ArrayList<>();
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Cartao> getCartoes() {
        return cartoes;
    }

    public void setCartoes(List<Cartao> cartoes) {
        this.cartoes = cartoes;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void adicionarEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public void adicionarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void adicionarCartao(Cartao cartao) {
        this.cartoes.add(cartao);
    }
}
