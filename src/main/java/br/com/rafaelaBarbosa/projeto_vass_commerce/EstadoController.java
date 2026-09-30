package br.com.rafaelaBarbosa.projeto_vass_commerce;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

@RestController
@RequestMapping(path = "/estado", produces = "application/json")
public class EstadoController {

    public EstadoController () {

    }

    @GetMapping
    public ResponseEntity<List<Estado>> listarEStados(@RequestParam(name = "nome", required = false) String nome) {
        if(nome == null || nome.isBlank()) {
            return ResponseEntity.ok(DadosMock.estados);
        }

        List<Estado> filtrados = new ArrayList<>();
        for(Estado estado : DadosMock.estados) {
            if(estado.getNome().toLowerCase().contains(nome.toLowerCase())) {
                filtrados.add(estado);
            }
        }
        return ResponseEntity.ok(filtrados);
    }
}
