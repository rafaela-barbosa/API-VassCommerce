package br.com.rafaelaBarbosa.projeto_vass_commerce;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Administrador extends Usuario {
    @JsonIgnore
    private Categoria categoriaResponsavel;

    public Administrador(String nomeCompleto, String email, String senha, Categoria categoriaResponsavel) {
        super(nomeCompleto, email, senha);
        this.categoriaResponsavel = categoriaResponsavel;
    }

    public Administrador(){}

    public Categoria getCategoriaResponsavel() {
        return categoriaResponsavel;
    }

    public void setCategoriaResponsavel(Categoria categoriaResponsavel) {
        this.categoriaResponsavel = categoriaResponsavel;
    }
}
