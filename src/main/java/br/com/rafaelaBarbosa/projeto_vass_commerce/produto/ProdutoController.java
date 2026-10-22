package br.com.rafaelaBarbosa.projeto_vass_commerce.produto;

import br.com.rafaelaBarbosa.projeto_vass_commerce.DadosMock;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.net.URI;
import java.util.List;
import java.util.ArrayList;


@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoModel model;

    public ProdutoController(@Qualifier("produtoModelSql") ProdutoModel model) {
        this.model = model;
    }

    @GetMapping
    public ResponseEntity<List<ProdutoResponse>> list(
            @RequestParam(required=false) String nome,
            @RequestParam(required=false) BigDecimal valorMinimo,
            @RequestParam(required=false) BigDecimal valorMaximo) {
        List<Produto> found = model.buscar(nome, valorMinimo, valorMaximo);
        return ResponseEntity.ok(found.stream().map(ProdutoMapper::toResponse).toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoResponse> buscarProdutoPorId(@PathVariable long id) {
        return model.obterPorId(id)
                .map(p -> ResponseEntity.ok(ProdutoMapper.toResponse(p)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping()
    public ResponseEntity<ProdutoResponse> create(@Valid @RequestBody ProdutoCreateRequest body) {
        Produto created = model.criar(body);
        URI location = URI.create("/produto/" + created.getId());
        return ResponseEntity.created(location).body(ProdutoMapper.toResponse(created));
    }


}
