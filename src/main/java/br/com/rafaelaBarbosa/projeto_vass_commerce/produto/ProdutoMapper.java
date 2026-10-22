package br.com.rafaelaBarbosa.projeto_vass_commerce.produto;

public final class ProdutoMapper {

    private ProdutoMapper() {}

    //Entrada da API -> Entidade
    public static Produto toEntity(ProdutoCreateRequest req, long newId) {
        Produto p = new Produto();
        p.setId(newId);
        p.setNome(req.getNome());
        p.setDescricao(req.getDescricao());
        p.setValorUnitario(req.getValorUnitario());
        return p;
    }

    //Entidade -> saída da API
    public static ProdutoResponse toResponse(Produto p) {
        ProdutoResponse r = new ProdutoResponse();
        r.setId(p.getId());
        r.setNome(p.getNome());
        r.setDescricao(p.getDescricao());
        r.setValorUnitario(p.getValorUnitario());
        return r;
    }




}
