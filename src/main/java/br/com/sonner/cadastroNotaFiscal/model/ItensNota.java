package br.com.sonner.cadastroNotaFiscal.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="tb_itens_notas")
public class ItensNota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_nota")
    private NotaFiscal nota;

    private Integer numero;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto id_produto;

    private BigDecimal quantidade;

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

    public Produto getId_produto() {
        return id_produto;
    }

    public void setId_produto(Produto produto) {
        this.id_produto = produto;
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
