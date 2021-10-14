package br.com.sonner.cadastroNotaFiscal.repository;

import br.com.sonner.cadastroNotaFiscal.model.NotaFiscal;
import br.com.sonner.cadastroNotaFiscal.model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
