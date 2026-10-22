package br.com.rafaelaBarbosa.projeto_vass_commerce.produto;

import br.com.rafaelaBarbosa.projeto_vass_commerce.Administrador;
import br.com.rafaelaBarbosa.projeto_vass_commerce.categoria.Categoria;
import br.com.rafaelaBarbosa.projeto_vass_commerce.PromocaoItem;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.List;

public class ProdutoCreateRequest {

    //O que a API aceita ao criar um Produto (entrada)
    @NotBlank
    private String nome;
    private String descricao;
    private String fotoUrl;
    @NotNull
    @Positive
    private float valorUnitario;
    private Categoria categoria;
    private Administrador admResponsavel;
    private List<PromocaoItem> desconto;

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

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

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
}
