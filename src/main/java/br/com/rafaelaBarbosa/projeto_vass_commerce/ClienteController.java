package br.com.rafaelaBarbosa.projeto_vass_commerce;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

@RestController
@RequestMapping(path = "/cliente", produces = "application/json")
public class ClienteController {

    public ClienteController() {

    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarClientePorId (@PathVariable long id) {
        Cliente encontrado = null;

        for(Cliente c : DadosMock.clientes) {
            if(c.getId() == id) {
                encontrado = c;
            }
        }
        if(encontrado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(encontrado);
    }

    @GetMapping("/{id}/formas-de-pagamento")
    public ResponseEntity<List<Cartao>> listarFormasDePagamentoPorCliente (@PathVariable long id) {
        Cliente encontrado = null;

        for(Cliente c : DadosMock.clientes) {
            if(c.getId() == id) {
                encontrado = c;
            }
        }
        if(encontrado ==  null) {
            return ResponseEntity.notFound().build();
        }

        List<Cartao> cartoesCliente = encontrado.getCartoes();
        return ResponseEntity.ok(cartoesCliente);
    }

    @GetMapping("/{id}/endereco")
    public ResponseEntity<List<Endereco>> buscarEnderecoCliente (@PathVariable long id) {
        Cliente encontrado = null;

        for(Cliente c : DadosMock.clientes) {
            if(c.getId() == id) {
                encontrado = c;
            }
        }
        if(encontrado ==  null) {
            return ResponseEntity.notFound().build();
        }

        List<Endereco> enderecoCliente = encontrado.getEnderecos();
        return ResponseEntity.ok(enderecoCliente);
    }

    @GetMapping("/{id}/pedido")
    public ResponseEntity<List<Pedido>> listarPedidosPorCliente (@PathVariable long id) {
        Cliente encontrado = null;

        for(Cliente c : DadosMock.clientes) {
            if(c.getId() == id) {
                encontrado = c;
            }
        }
        if(encontrado ==  null) {
            return ResponseEntity.notFound().build();
        }

        List<Pedido> pedidosCliente = encontrado.getPedidos();
        return ResponseEntity.ok(pedidosCliente);
    }
}
