package br.com.sonner.cadastroNotaFiscal.controller;

import br.com.sonner.cadastroNotaFiscal.DTO.ClienteDTO;
import br.com.sonner.cadastroNotaFiscal.DTO.ItensNotaDTO;
import br.com.sonner.cadastroNotaFiscal.model.Cliente;
import br.com.sonner.cadastroNotaFiscal.model.ItensNota;
import br.com.sonner.cadastroNotaFiscal.repository.ClienteRepository;
import br.com.sonner.cadastroNotaFiscal.repository.ItensNotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItensNotaController {
    @Autowired
    private ItensNotaRepository itensNotaRepository;

    @RequestMapping("/itensnota")
    public List<ItensNotaDTO> lista() {
        List<ItensNota> itensNotas = (List<ItensNota>) itensNotaRepository.findAll();
        return ItensNotaDTO.lista(itensNotas);

    }
}
