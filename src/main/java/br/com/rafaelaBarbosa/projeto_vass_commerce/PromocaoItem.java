package br.com.rafaelaBarbosa.projeto_vass_commerce;

import br.com.rafaelaBarbosa.projeto_vass_commerce.produto.Produto;

import java.time.LocalDateTime;

public class PromocaoItem {

    private long id;
    private float valorPromocao;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataUltimaAtualizacao;
    private Produto produto;
    private TabelaPromocao tabelaPromocao;

    public PromocaoItem() {
        this.dataCadastro = LocalDateTime.now();
        this.dataUltimaAtualizacao = LocalDateTime.now();
    }

    public PromocaoItem(Produto produto, TabelaPromocao tabelaPromocao, float valorPromocao) {
        this.produto = produto;
        this.tabelaPromocao = tabelaPromocao;
        this.valorPromocao = valorPromocao;
        this.dataCadastro = LocalDateTime.now();
        this.dataUltimaAtualizacao = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getValorPromocao() {
        return valorPromocao;
    }

    public void setValorPromocao(float valorPromocao) {
        this.valorPromocao = valorPromocao;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDateTime getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public TabelaPromocao getTabelaPromocao() {
        return tabelaPromocao;
    }

    public void setTabelaPromocao(TabelaPromocao tabelaPromocao) {
        this.tabelaPromocao = tabelaPromocao;
    }
}
