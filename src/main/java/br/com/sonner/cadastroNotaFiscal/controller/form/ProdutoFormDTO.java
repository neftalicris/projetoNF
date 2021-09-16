package br.com.sonner.cadastroNotaFiscal.controller.form;

import br.com.sonner.cadastroNotaFiscal.model.Cliente;

public class ClienteFormDTO {
    private String codigo;
    private String nome;

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
