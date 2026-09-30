package br.com.rafaelaBarbosa.projeto_vass_commerce;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Cidade {

    private long id;
    private String nome;
    @JsonIgnore
    private Estado estado;

    public Cidade() {}

    public Cidade(String nome, Estado estado) {
        this.nome = nome;
        this.estado = estado;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
