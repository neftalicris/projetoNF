package br.com.sonner.cadastroNotaFiscal.controller.form;

import br.com.sonner.cadastroNotaFiscal.model.Produto;

import java.math.BigDecimal;

public class ProdutoFormDTO {
    private String codigo;
    private String descricao;
    private BigDecimal valorUnitario;

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

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    public Produto converter() {
        return new Produto(codigo, descricao, valorUnitario);
    }

}
