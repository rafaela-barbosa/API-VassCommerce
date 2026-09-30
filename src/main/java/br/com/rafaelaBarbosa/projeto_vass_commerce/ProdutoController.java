package br.com.rafaelaBarbosa.projeto_vass_commerce;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private List<Produto> produtos;

    public ProdutoController() {
        produtos = new ArrayList<>();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarProdutoPorId(@PathVariable long id) {
        Produto encontrado = null;

        for(Produto p : DadosMock.produtos) {
            if(p.getId() == id) {
                encontrado = p;
            }
        }
        if (encontrado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(encontrado);
    }

}
