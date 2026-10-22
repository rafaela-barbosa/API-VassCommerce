package br.com.rafaelaBarbosa.projeto_vass_commerce.produto;

import br.com.rafaelaBarbosa.projeto_vass_commerce.DadosMock;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service("produtoModelMemoria")
public class ProdutoModelMemoria implements ProdutoModel{

    private final List<Produto> banco = new ArrayList<>();
    private final AtomicLong seq = new AtomicLong(0);

    @Override
    public Produto criar(ProdutoCreateRequest req) {
        Long novoId = seq.incrementAndGet();
        Produto p = ProdutoMapper.toEntity(req, novoId);
        banco.add(p);
        return p;
    }
    @Override
    public Optional<Produto> obterPorId(Long id) {
        return banco.stream().filter(p -> Objects.equals(p.getId(), id)).findFirst();
    }
    @Override
    public List<Produto> buscar(String nome, BigDecimal min, BigDecimal max) {
        return banco.stream()
                .filter(p -> nome == null || nome.isBlank() || (p.getNome() != null && p.getNome().toLowerCase().contains(nome.toLowerCase())))
                .filter(p -> min == null || p.getValorUnitario() >= min.floatValue())
                .filter(p -> max == null || p.getValorUnitario() <= max.floatValue())
                .toList();
    }
}

