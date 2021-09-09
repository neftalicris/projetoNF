package br.com.sonner.cadastroNotaFiscal.repository;

import br.com.sonner.cadastroNotaFiscal.orm.NotaFiscal;
import br.com.sonner.cadastroNotaFiscal.orm.Produto;
import org.springframework.data.repository.CrudRepository;

public interface NotaFiscalRepository extends CrudRepository<NotaFiscal, Integer> {
}
