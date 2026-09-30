
package br.com.rafaelaBarbosa.projeto_vass_commerce;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

@RestController
@RequestMapping(path = "/categoria", produces = "application/json")
public class CategoriaController {


    public CategoriaController() {

    }

    @GetMapping
    public ResponseEntity<List<Categoria>> buscarPorNome(@RequestParam(name = "nome", required = false) String nome) {

        if (nome == null || nome.isBlank()) {
            return ResponseEntity.ok(DadosMock.categorias);
        }

        List<Categoria> filtrados = new ArrayList<>();
        for(Categoria categoria : DadosMock.categorias) {
            if(categoria.getNome().toLowerCase().contains(nome.toLowerCase())) {
                filtrados.add(categoria);
            }
        }

        return ResponseEntity.ok(filtrados);
    }

    @GetMapping("/{id}/produto")
    public ResponseEntity<List<Produto>> buscarProdutosPorCategoria(@PathVariable long id) {
        Categoria encontrada =  null;

        for(Categoria categoria : DadosMock.categorias) {
            if(Objects.equals(categoria.getId(), id)) {
                encontrada = categoria;
                break;
            }
        }
        if (encontrada == null) {
            return ResponseEntity.notFound().build();
        }

        List<Produto> produtosDaCategoria = encontrada.getProdutos();
        return ResponseEntity.ok(produtosDaCategoria);
    }

    @PostMapping()
    public ResponseEntity<Categoria> create(@RequestBody Categoria categoria) {
        categoria.setId((long) (DadosMock.categorias.size() + 1));
        DadosMock.categorias.add(categoria);
        return ResponseEntity.status(201).body(categoria);
    }

}
