package br.com.sonner.cadastroNotaFiscal;

import br.com.sonner.cadastroNotaFiscal.model.Cliente;
import br.com.sonner.cadastroNotaFiscal.model.ItensNota;
import br.com.sonner.cadastroNotaFiscal.model.NotaFiscal;
import br.com.sonner.cadastroNotaFiscal.model.Produto;
import br.com.sonner.cadastroNotaFiscal.repository.ClienteRepository;
import br.com.sonner.cadastroNotaFiscal.repository.ItensNotaRepository;
import br.com.sonner.cadastroNotaFiscal.repository.NotaFiscalRepository;
import br.com.sonner.cadastroNotaFiscal.repository.ProdutoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class CadastroNotaFiscalApplication implements CommandLineRunner {

    private final ProdutoRepository produtoRepository;
    private final ClienteRepository clienteRepository;
    private final NotaFiscalRepository notaFiscalRepository;
    private final ItensNotaRepository itensNotaRepository;

    public CadastroNotaFiscalApplication(ProdutoRepository produtoRepository, ClienteRepository clienteRepository, NotaFiscalRepository notaFiscalRepository, ItensNotaRepository itensNotaRepository){
        this.produtoRepository = produtoRepository;
        this.clienteRepository = clienteRepository;
        this.notaFiscalRepository = notaFiscalRepository;
        this.itensNotaRepository = itensNotaRepository;
    }

	public static void main(String[] args) {
		SpringApplication.run(CadastroNotaFiscalApplication.class, args);
	}
    @Override
    public void run(String... args) throws Exception{
//        Produto produto = new Produto();
//        produto.setDescricao("MOUSE SEM FIO");
//        produto.setValor_unitario();
//        produtoRepository.save(produto);
//
//        Cliente cliente = new Cliente();
//        cliente.setNome("Cristina");
//        clienteRepository.save(cliente);
//
//        NotaFiscal notaFiscal = new NotaFiscal();
//        notaFiscal.setData_nota();
//        notaFiscal.setCliente();
//        notaFiscalRepository.save(notaFiscal);
//
//        ItensNota itensNota = new ItensNota();
//        itensNota.setProduto("MOUSE");
//        itensNota.setQuantidade(BigDecimal.valueOf(1));
//        itensNota.setNota(1);
//        itensNotaRepository.save(itensNota);
    }

}
