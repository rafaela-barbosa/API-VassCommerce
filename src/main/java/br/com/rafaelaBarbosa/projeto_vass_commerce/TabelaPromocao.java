package br.com.rafaelaBarbosa.projeto_vass_commerce;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TabelaPromocao {

    private Administrador admResponsavel;
    private long id;
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataUltimaAtualizacao;
    private List<PromocaoItem> itensPromocao;

    public TabelaPromocao(String nome, String descricao, LocalDate dataInicio, LocalDate dataFim, Administrador admResponsavel) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.dataCadastro = LocalDateTime.now();
        this.dataUltimaAtualizacao = LocalDateTime.now();

        this.admResponsavel = admResponsavel;

        this.itensPromocao = new ArrayList<>();
    }

    public Administrador getAdmResponsavel() {
        return admResponsavel;
    }

    public void setAdmResponsavel(Administrador admResponsavel) {
        this.admResponsavel = admResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
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

    public List<PromocaoItem> getItensPromocao() {
        return itensPromocao;
    }

    public void setItensPromocao(List<PromocaoItem> itensPromocao) {
        this.itensPromocao = itensPromocao;
    }

    public void adicionarItemPromocao(PromocaoItem itemPromocao) {
        this.itensPromocao.add(itemPromocao);
    }
}
