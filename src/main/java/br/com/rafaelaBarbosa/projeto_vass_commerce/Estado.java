package br.com.rafaelaBarbosa.projeto_vass_commerce;

import java.util.List;
import java.util.ArrayList;

public class Estado {

    private int id;
    private String sigla;
    private String nome;
    private List<Cidade> cidades;

    public Estado(){}

    public Estado(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        this.cidades = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }
    public void adicionarCidade(Cidade cidade) {
        this.cidades.add(cidade);
    }
}
