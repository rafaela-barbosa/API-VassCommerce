package br.com.rafaelaBarbosa.projeto_vass_commerce.produto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ProdutoModel {

    Produto criar(ProdutoCreateRequest req);
    Optional<Produto> obterPorId(Long id);
    List<Produto> buscar(String nome, BigDecimal valorMinimo, BigDecimal valorMaximo);
}
