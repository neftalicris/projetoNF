package br.com.sonner.cadastroNotaFiscal.orm;

import javax.persistence.*;

@Entity
@Table(name="tb_itens_notas")
public class ItensNota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo_item;
    @OneToOne(mappedBy = "tb_produto")
    @JoinColumn(name = "codigo", nullable = false)
    private Integer codigo_produto;
    private Double quantidade;
    @OneToMany(mappedBy = "tb_nota")
    @JoinColumn(name = "codigo", nullable = false)
    private Integer codigo_nota;

    public Integer getCodigo_item() {
        return codigo_item;
    }

    public void setCodigo_item(Integer codigo_item) {
        this.codigo_item = codigo_item;
    }

    public Integer getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(Integer codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getCodigo_nota() {
        return codigo_nota;
    }

    public void setCodigo_nota(Integer codigo_nota) {
        this.codigo_nota = codigo_nota;
    }
}
