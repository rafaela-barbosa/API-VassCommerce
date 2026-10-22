package br.com.rafaelaBarbosa.projeto_vass_commerce.cidade;

public class CidadeResponse {

    // O que a API devolce ao cliente (saída)
    private long id;
    private String nome;

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
}
