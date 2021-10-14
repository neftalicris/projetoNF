package br.com.sonner.cadastroNotaFiscal.repository;

import br.com.sonner.cadastroNotaFiscal.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    Cliente findByNome(String nome);
}
