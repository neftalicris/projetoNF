package br.com.sonner.cadastroNotaFiscal.controller.form;

import br.com.sonner.cadastroNotaFiscal.model.Cliente;

public class ClienteFormDTO {
    private Integer id;
    private String codigo;
    private String nome;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente converter() {
        return new Cliente(codigo, nome);
    }
}
