package br.com.sonner.cadastroNotaFiscal.DTO;

import br.com.sonner.cadastroNotaFiscal.model.Cliente;
import br.com.sonner.cadastroNotaFiscal.model.Produto;

import java.util.List;
import java.util.stream.Collectors;

public class ClienteDTO {
    private Integer id;
    private String codigo;
    private String nome;

    public ClienteDTO(Cliente cliente) {
        this.codigo = cliente.getCodigo();
        this.nome = cliente.getNome();
    }
    public static List<ClienteDTO> lista(List<Cliente> clientes) {
        return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
    }

    public Integer getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
