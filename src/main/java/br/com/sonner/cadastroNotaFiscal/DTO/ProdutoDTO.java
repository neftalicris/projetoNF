package br.com.sonner.cadastroNotaFiscal.DTO;

import br.com.sonner.cadastroNotaFiscal.model.Produto;

import java.util.List;
import java.util.stream.Collectors;

public class ProdutoDTO {
    private Integer id;
    private String codigo;
    private String descricao;

    public ProdutoDTO(Produto produto) {
        this.id = produto.getId();
        this.codigo = produto.getCodigo();
        this.descricao = produto.getDescricao();
    }

    public static List<ProdutoDTO> lista(List<Produto> produtos) {
        return produtos.stream().map(ProdutoDTO::new).collect(Collectors.toList());
    }

    public Integer getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
