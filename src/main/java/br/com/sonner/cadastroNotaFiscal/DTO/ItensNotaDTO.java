package br.com.sonner.cadastroNotaFiscal.DTO;

import br.com.sonner.cadastroNotaFiscal.model.Cliente;
import br.com.sonner.cadastroNotaFiscal.model.ItensNota;
import br.com.sonner.cadastroNotaFiscal.model.NotaFiscal;
import br.com.sonner.cadastroNotaFiscal.model.Produto;

import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ItensNotaDTO {
    private Integer numero;
    private BigDecimal quantidade;
    private BigDecimal valor_final;
    private NotaFiscal nota;
    private Produto produto;

    public ItensNotaDTO(ItensNota itensNota) {
        this.numero = itensNota.getNumero();
        this.quantidade = itensNota.getQuantidade();
        this.valor_final = itensNota.getValor_final();
        this.nota = itensNota.getNota();
        this.produto = itensNota.getProduto();
    }
    public static List<ItensNotaDTO> lista(List<ItensNota> itensNotas) {
        return itensNotas.stream().map(ItensNotaDTO::new).collect(Collectors.toList());
    }

    public Integer getNumero() {
        return numero;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public BigDecimal getValor_final() {
        return valor_final;
    }

    public NotaFiscal getNota() {
        return nota;
    }

    public Produto getProduto() {
        return produto;
    }
}
