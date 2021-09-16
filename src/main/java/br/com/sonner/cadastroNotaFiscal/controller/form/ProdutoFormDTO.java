package br.com.sonner.cadastroNotaFiscal.controller.form;

import br.com.sonner.cadastroNotaFiscal.model.Produto;

import java.math.BigDecimal;

public class ProdutoFormDTO {
    private String codigo;
    private String descricao;
    private BigDecimal valor_unitario;

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

    public Produto converter() {
        return new Produto(codigo, descricao, valor_unitario);
    }

}
