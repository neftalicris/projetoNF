package br.com.sonner.cadastroNotaFiscal.controller.form;

import br.com.sonner.cadastroNotaFiscal.model.Cliente;
import br.com.sonner.cadastroNotaFiscal.model.ItensNota;
import br.com.sonner.cadastroNotaFiscal.model.NotaFiscal;
import br.com.sonner.cadastroNotaFiscal.repository.ClienteRepository;
import br.com.sonner.cadastroNotaFiscal.repository.NotaFiscalRepository;

import java.util.Date;
import java.util.List;

public class NotaFiscalFormDTO {
    private Integer id;
    private String codigo;
    private String nomeCliente;
    private Date data_nota;
    private List<ItensNota> itens;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setData_nota(Date data_nota) {
        this.data_nota = data_nota;
    }

    public String getCodigo() {
        return codigo;
    }

    public Date getData_nota() {
        return data_nota;
    }

    public List<ItensNota> getItens() {
        return itens;
    }

    public void setItens(List<ItensNota> itens) {
        this.itens = itens;
    }

    public NotaFiscal converter(ClienteRepository clienteRepository) {
        Cliente cliente = clienteRepository.findByNome(nomeCliente);
        return new NotaFiscal(codigo, cliente, data_nota);
    }
}
