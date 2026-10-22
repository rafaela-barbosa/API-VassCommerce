package br.com.rafaelaBarbosa.projeto_vass_commerce.cidade;

import br.com.rafaelaBarbosa.projeto_vass_commerce.produto.ProdutoResponse;

public class CidadeMapper {

    private CidadeMapper() {}

    //Entrada da API -> Entidade
    public static Cidade toEntity(CidadeCreateRequest req, long newId) {
        Cidade c = new Cidade();
        c.setId(newId);
        c.setNome(req.getNome());
        c.setEstado(req.getEstado());
        return c;
    }

    //Entidade -> saída da API
    public static CidadeResponse toResponse(Cidade c) {
        CidadeResponse r = new CidadeResponse();
        r.setId(c.getId());
        r.setNome(c.getNome());
        return r;
    }
}
