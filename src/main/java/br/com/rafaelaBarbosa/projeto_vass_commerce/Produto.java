package br.com.rafaelaBarbosa.projeto_vass_commerce;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Produto {

    private long id;
    private String nome;
    private String descricao;
    private String fotoUrl;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataUltimaAtualizacao;
    private float valorUnitario;
    @JsonIgnore
    private Categoria categoria;
    @JsonIgnore
    private Administrador admResponsavel;
    private List<PromocaoItem> desconto;


    public Produto(String nome, String descricao, float valorUnitario, Categoria categoria, Administrador admResponsavel) {
        this.nome = nome;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.categoria = categoria;
        this.admResponsavel = admResponsavel;
        this.dataCadastro = LocalDateTime.now();
        this.desconto = new ArrayList<>();
    }

    public Produto() {}

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Administrador getAdmResponsavel() {
        return admResponsavel;
    }

    public void setAdmResponsavel(Administrador admResponsavel) {
        this.admResponsavel = admResponsavel;
    }

    public List<PromocaoItem> getDesconto() {
        return desconto;
    }

    public void setDesconto(List<PromocaoItem> desconto) {
        this.desconto = desconto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
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

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
