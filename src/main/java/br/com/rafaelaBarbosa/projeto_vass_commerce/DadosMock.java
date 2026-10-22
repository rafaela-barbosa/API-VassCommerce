package br.com.rafaelaBarbosa.projeto_vass_commerce;

import br.com.rafaelaBarbosa.projeto_vass_commerce.categoria.Categoria;
import br.com.rafaelaBarbosa.projeto_vass_commerce.cliente.Cliente;
import br.com.rafaelaBarbosa.projeto_vass_commerce.produto.Produto;
import br.com.rafaelaBarbosa.projeto_vass_commerce.cidade.Cidade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DadosMock {
    public static List<Estado> estados = new ArrayList<>();
    public static List<Cidade> cidades = new ArrayList<>();
    public static List<Administrador> administradores = new ArrayList<>();
    public static List<Produto> produtos = new ArrayList<>();
    public static List<Cliente> clientes = new ArrayList<>();
    public static List<Endereco> enderecos = new ArrayList<>();
    public static List<Cartao> cartoes = new ArrayList<>();
    public static List<Categoria> categorias = new ArrayList<>();
    public static List<Pedido> pedidos = new ArrayList<>();
    public static List<TabelaPromocao> promocoes = new ArrayList<>();

    static {
        Estado rj = new Estado("RJ", "Rio de Janeiro");
        rj.setId(1);
        Cidade vassouras = new Cidade("Vassouras", rj);
        vassouras.setId(1L);
        rj.adicionarCidade(vassouras);

        estados.add(rj);
        cidades.add(vassouras);

        Categoria eletronicos = new Categoria("Eletrônicos", "Aparelhos e gadgets eletrônicos");
        eletronicos.setId(1L);
        categorias.add(eletronicos);

        Categoria livros = new Categoria("Livros", "Livros físicos, e-books e literatura técnica");
        livros.setId(2L);
        categorias.add(livros);

        Administrador adminEletronicos = new Administrador("Carlos Silva", "carlos@vasscommerce.com", "admin123", eletronicos);
        adminEletronicos.setId(1L);
        administradores.add(adminEletronicos);

        Administrador adminLivros = new Administrador("Mariana Lima", "mariana@vasscommerce.com", "admin456", livros);
        adminLivros.setId(2L);
        administradores.add(adminLivros);

        Produto smartphone = new Produto("Smartphone X", "128GB Tela 6.1", 2500.0f, eletronicos, adminEletronicos);
        smartphone.setId(1L);
        produtos.add(smartphone);

        eletronicos.getProdutos().add(smartphone);

        Produto livroJava = new Produto("Java Efetivo", "Guia de melhores práticas de programação em Java", 150.0f, livros, adminLivros);
        livroJava.setId(2L);
        produtos.add(livroJava);

        livros.getProdutos().add(livroJava);

        TabelaPromocao blackFriday = new TabelaPromocao("Black Friday", "Descontos de Novembro", LocalDate.now(), LocalDate.now().plusDays(10), adminEletronicos);
        blackFriday.setId(1L);
        PromocaoItem itemPromo = new PromocaoItem(smartphone, blackFriday, 2100.0f);
        itemPromo.setId(1L);
        blackFriday.adicionarItemPromocao(itemPromo);
        promocoes.add(blackFriday);

        Cliente cliente = new Cliente("Ana Souza", "ana@email.com", "senha123", "123.456.789-00", LocalDate.of(1998, 5, 20));
        cliente.setId(1L);

        Endereco endereco = new Endereco("Rua das Flores", 100, "Centro", vassouras, "27700-000");
        endereco.setId(1L);
        cliente.adicionarEndereco(endereco);
        enderecos.add(endereco);

        Cartao cartao = new Cartao(TipoCartao.CREDITO, cliente);
        cartao.setId(1L);
        cliente.adicionarCartao(cartao);
        cartoes.add(cartao);

        clientes.add(cliente);

        ItemPedido itemPedido1 = new ItemPedido(smartphone, 1, 2100.0f);
        itemPedido1.setId(1L);
        ItemPedido itemPedido2 = new ItemPedido(livroJava, 1, 149.90f);
        itemPedido2.setId(2L);
        List<ItemPedido> itens = new ArrayList<>();

        itens.add(itemPedido1);
        itens.add(itemPedido2);

        Pedido pedido = new Pedido(cliente, itens);
        pedido.setId(1L);

        Pagamento pagamento = new Pagamento(cliente, cartao, pedido, 2100.0f);
        pagamento.setId(1L);
        pedido.getPagamentos().add(pagamento);

        cliente.adicionarPedido(pedido);
        pedidos.add(pedido);

    }
}
