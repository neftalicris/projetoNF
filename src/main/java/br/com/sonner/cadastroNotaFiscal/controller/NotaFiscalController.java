package br.com.sonner.cadastroNotaFiscal.controller;

import br.com.sonner.cadastroNotaFiscal.DTO.NotaFiscalDTO;
import br.com.sonner.cadastroNotaFiscal.model.NotaFiscal;
import br.com.sonner.cadastroNotaFiscal.repository.NotaFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nota")
public class NotaFiscalController {

    @Autowired
    private NotaFiscalRepository notaFiscalRepository;

    @GetMapping("/{id}")
    public ResponseEntity<NotaFiscal> get(@PathVariable("id") Integer id) {
        NotaFiscal nf = notaFiscalRepository.findById(id).get();
//        return nf;
        return new ResponseEntity<NotaFiscal>(nf, HttpStatus.OK);
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
