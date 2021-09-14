package br.com.sonner.cadastroNotaFiscal.controller;

import br.com.sonner.cadastroNotaFiscal.DTO.ClienteDTO;
import br.com.sonner.cadastroNotaFiscal.DTO.NotaFiscalDTO;
import br.com.sonner.cadastroNotaFiscal.model.Cliente;
import br.com.sonner.cadastroNotaFiscal.model.NotaFiscal;
import br.com.sonner.cadastroNotaFiscal.repository.ClienteRepository;
import br.com.sonner.cadastroNotaFiscal.repository.NotaFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotaFiscalController {
    @Autowired
    private NotaFiscalRepository notaFiscalRepository;

    @RequestMapping("/notafiscal")
    public List<NotaFiscalDTO> lista() {
        List<NotaFiscal> notaFiscal = (List<NotaFiscal>) notaFiscalRepository.findAll();
        return NotaFiscalDTO.lista(notaFiscal);

    }
}
