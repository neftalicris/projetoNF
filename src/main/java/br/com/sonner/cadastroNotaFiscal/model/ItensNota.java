package br.com.sonner.cadastroNotaFiscal.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="tb_itens_notas")
public class ItensNota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer numero;
    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;
    private BigDecimal quantidade;
    @ManyToOne
    @JoinColumn(name = "id_nota")
    private NotaFiscal nota;
    private BigDecimal valor_final;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public NotaFiscal getNota() {
        return nota;
    }

    public void setNota(NotaFiscal nota) {
        this.nota = nota;
    }

    public BigDecimal getValor_final() {
        return valor_final;
    }

    public void setValor_final(BigDecimal valor_final) {
        this.valor_final = valor_final;
    }
}
