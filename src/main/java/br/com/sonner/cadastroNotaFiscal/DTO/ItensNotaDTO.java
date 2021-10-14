package br.com.sonner.cadastroNotaFiscal.DTO;

import br.com.sonner.cadastroNotaFiscal.model.ItensNota;
import br.com.sonner.cadastroNotaFiscal.model.NotaFiscal;
import br.com.sonner.cadastroNotaFiscal.model.Produto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ItensNotaDTO {
    private Integer id;
    private Integer numero;
    private BigDecimal quantidade;
    private BigDecimal valor_final;
    private NotaFiscal nota;
    private Produto produto;

    public ItensNotaDTO(ItensNota itensNota) {
        this.id = itensNota.getId();
        this.numero = itensNota.getNumero();
        this.quantidade = itensNota.getQuantidade();
        this.valor_final = itensNota.getValor_final();
<<<<<<< Updated upstream
        this.nota = itensNota.getId_nota();
        this.produto = itensNota.getProduto();
=======
        this.nota = itensNota.getNota();
        this.produto = itensNota.getId_produto();
>>>>>>> Stashed changes
    }
    public static List<ItensNotaDTO> lista(List<ItensNota> itensNotas) {
        return itensNotas.stream().map(ItensNotaDTO::new).collect(Collectors.toList());
    }

    public Integer getId() {
        return id;
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
