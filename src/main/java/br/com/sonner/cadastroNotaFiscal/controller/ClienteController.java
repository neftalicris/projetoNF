package br.com.sonner.cadastroNotaFiscal.controller;

import br.com.sonner.cadastroNotaFiscal.DTO.ClienteDTO;
import br.com.sonner.cadastroNotaFiscal.model.Cliente;
import br.com.sonner.cadastroNotaFiscal.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @RequestMapping("/cliente")
    public List<ClienteDTO> lista() {
        List<Cliente> clientes = (List<Cliente>) clienteRepository.findAll();
        return ClienteDTO.lista(clientes);

    }
}
