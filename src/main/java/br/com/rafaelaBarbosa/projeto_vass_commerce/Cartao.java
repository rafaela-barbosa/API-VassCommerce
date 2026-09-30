package br.com.rafaelaBarbosa.projeto_vass_commerce;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;

public class Cartao {

    private long id;
    private LocalDateTime dataCriacao;
    private boolean excluido;
    private TipoCartao tipoCartao;
    @JsonIgnore
    private Cliente titular;

    public Cartao(TipoCartao tipoCartao, Cliente titular) {
        this.tipoCartao = tipoCartao;
        this.titular = titular;
        this.excluido = false;
        this.dataCriacao = LocalDateTime.now();
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public boolean isExcluido() {
        return excluido;
    }

    public void setExcluido(boolean excluido) {
        this.excluido = excluido;
    }

    public TipoCartao getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(TipoCartao tipoCartao) {
        this.tipoCartao = tipoCartao;
    }
}
