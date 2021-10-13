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
import java.util.Optional;

@RestController
public class NotaFiscalController {
    @Autowired
    private NotaFiscalRepository notaFiscalRepository;

    @RequestMapping("/notafiscal")
    @GetMapping("/{id}")
    public NotaFiscal get(@PathVariable("id") Integer id) {
        Optional<NotaFiscal> nf = notaFiscalRepository.findById(id);
        return nf.get();
    }

    public List<NotaFiscalDTO> lista() {
        List<NotaFiscal> notaFiscal = (List<NotaFiscal>) notaFiscalRepository.findAll();
        return NotaFiscalDTO.lista(notaFiscal);

    }


//    @PostMapping("/")
//    public NotaFiscal salvar(@RequestBody NotaFiscal notaFiscal, ItensNota itensNota){
//        notaFiscal = notaFiscalRepository.save(notaFiscal);
//        itensNota = itensNotaRepository.save(itensNota);
//        itensNotaController.salvar(itensNota);
//        return notaFiscal;
//    }
}
