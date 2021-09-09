package br.com.sonner.cadastroNotaFiscal;

import br.com.sonner.cadastroNotaFiscal.orm.Cliente;
import br.com.sonner.cadastroNotaFiscal.orm.ItensNota;
import br.com.sonner.cadastroNotaFiscal.orm.NotaFiscal;
import br.com.sonner.cadastroNotaFiscal.orm.Produto;
import br.com.sonner.cadastroNotaFiscal.repository.ClienteRepository;
import br.com.sonner.cadastroNotaFiscal.repository.ItensNotaRepository;
import br.com.sonner.cadastroNotaFiscal.repository.NotaFiscalRepository;
import br.com.sonner.cadastroNotaFiscal.repository.ProdutoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.crypto.Data;
import java.util.Date;

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
        Produto produto = new Produto();
        produto.setDescricao("MOUSE SEM FIO");
        produto.setValor_unitario(60);
        produtoRepository.save(produto);

        Cliente cliente = new Cliente();
        cliente.setNome("Cristina");
        clienteRepository.save(cliente);

        NotaFiscal notaFiscal = new NotaFiscal();
       // Date data= new Date();
      //  notaFiscal.setData_nota();
        notaFiscal.setCodigo_cliente(1);
        notaFiscalRepository.save(notaFiscal);

        ItensNota itensNota = new ItensNota();
        itensNota.setCodigo_produto(1);
        itensNota.setQuantidade(1.0);
        itensNota.setCodigo_nota(1);
        itensNotaRepository.save(itensNota);
    }

}
