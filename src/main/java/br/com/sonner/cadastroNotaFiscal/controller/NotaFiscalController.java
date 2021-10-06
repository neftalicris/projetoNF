package br.com.sonner.cadastroNotaFiscal.controller;

import br.com.sonner.cadastroNotaFiscal.DTO.ClienteDTO;
import br.com.sonner.cadastroNotaFiscal.DTO.NotaFiscalDTO;
import br.com.sonner.cadastroNotaFiscal.controller.form.ClienteFormDTO;
import br.com.sonner.cadastroNotaFiscal.controller.form.NotaFiscalFormDTO;
import br.com.sonner.cadastroNotaFiscal.model.Cliente;
import br.com.sonner.cadastroNotaFiscal.model.ItensNota;
import br.com.sonner.cadastroNotaFiscal.model.NotaFiscal;
import br.com.sonner.cadastroNotaFiscal.model.Produto;
import br.com.sonner.cadastroNotaFiscal.repository.ClienteRepository;
import br.com.sonner.cadastroNotaFiscal.repository.ItensNotaRepository;
import br.com.sonner.cadastroNotaFiscal.repository.NotaFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/notafiscal")
public class NotaFiscalController {

    @Autowired
    private NotaFiscalRepository notaFiscalRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ItensNotaRepository itensNotaRepository;

    private  ItensNotaController itensNotaController;

    @GetMapping
    public List<NotaFiscalDTO> lista() {
        List<NotaFiscal> notaFiscal = (List<NotaFiscal>) notaFiscalRepository.findAll();
        return NotaFiscalDTO.lista(notaFiscal);

    }
//    @PostMapping("/")
//    public NotaFiscal salvar(@RequestBody NotaFiscal notaFiscal){
//        notaFiscal = notaFiscalRepository.save(notaFiscal);
//        return notaFiscal;
//    }
    @PostMapping("/")
    public NotaFiscal salvar(@RequestBody NotaFiscal notaFiscal, ItensNota itensNota){
        notaFiscal = notaFiscalRepository.save(notaFiscal);
        itensNota = itensNotaRepository.save(itensNota);
        itensNotaController.salvar(itensNota);
        return notaFiscal;
    }

    @PutMapping("/")
    public NotaFiscal alterar(@RequestBody NotaFiscal notaFiscal){
        notaFiscal = notaFiscalRepository.save(notaFiscal);
        return notaFiscal;
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id){

        notaFiscalRepository.deleteById(id);
    }
//    @PostMapping
//    public ResponseEntity<NotaFiscalDTO> cadastrar(@RequestBody NotaFiscalFormDTO notaFiscalForm, UriComponentsBuilder uriBuilder){
//        NotaFiscal notaFiscal = notaFiscalForm.converter(clienteRepository);
//        notaFiscalRepository.save(notaFiscal);
//        URI uri = uriBuilder.path("/cliente/{id}").buildAndExpand(notaFiscal.getId()).toUri();
//        return ResponseEntity.created(uri).body(new NotaFiscalDTO(notaFiscal));
//    }
}
