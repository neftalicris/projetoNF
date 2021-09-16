package br.com.sonner.cadastroNotaFiscal.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="tb_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigo;
    private String descricao;
    private BigDecimal valor_unitario;

    public Produto(String codigo, String descricao, BigDecimal valor_unitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor_unitario = valor_unitario;
    }

    public Produto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(BigDecimal valor_unitario) {
        this.valor_unitario = valor_unitario;
    }
}

