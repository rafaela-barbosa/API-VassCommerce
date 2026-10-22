package br.com.rafaelaBarbosa.projeto_vass_commerce.produto;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;


@Service("produtoModelSql")
public class ProdutoModelSql implements ProdutoModel {

    private final List<Produto> repositorioSql = new ArrayList<>();
    private final AtomicLong seq = new AtomicLong(100);

    @Override
    public Produto criar(ProdutoCreateRequest req) {
        System.out.println("[SQL SIMULATION] Executando: INSERT INTO produto ... ");
        Long novoId = seq.incrementAndGet();

        Produto produto = ProdutoMapper.toEntity(req, novoId);
        repositorioSql.add(produto);

        return produto;
    }

    @Override
    public Optional<Produto> obterPorId(Long id) {
        System.out.println("[SQL SIMULATION] Executando: SELECT * FROM produto WHERE id = " + id);
        return repositorioSql.stream()
                .filter(p -> Objects.equals(p.getId(), id))
                .findFirst();
    }

    @Override
    public List<Produto> buscar(String nome, BigDecimal min, BigDecimal max) {
        System.out.println("[SQL SIMULATION] Executando: SELECT * FROM produto WHERE nome LIKE ? AND preco BETWEEN ? AND ?");
        return repositorioSql.stream()
                .filter(p -> nome == null || nome.isBlank() || (p.getNome() != null && p.getNome().toLowerCase().contains(nome.toLowerCase())))
                .filter(p -> min == null || p.getValorUnitario() >= min.floatValue())
                .filter(p -> max == null || p.getValorUnitario() <= max.floatValue())
                .toList();
    }
}
