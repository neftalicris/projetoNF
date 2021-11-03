package br.com.sonner.cadastroNotaFiscal.controller;

import br.com.sonner.cadastroNotaFiscal.DTO.ClienteDTO;
import br.com.sonner.cadastroNotaFiscal.DTO.ItensNotaDTO;
import br.com.sonner.cadastroNotaFiscal.model.Cliente;
import br.com.sonner.cadastroNotaFiscal.model.ItensNota;
import br.com.sonner.cadastroNotaFiscal.model.NotaFiscal;
import br.com.sonner.cadastroNotaFiscal.repository.ClienteRepository;
import br.com.sonner.cadastroNotaFiscal.repository.ItensNotaRepository;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/itensnota")
public class ItensNotaController {

    @Autowired
    private ItensNotaRepository itensNotaRepository;


//    @GetMapping("/{id}")
//    public ItensNota get(@PathVariable("id") Integer id) {
//        Optional<ItensNota> iNota = itensNotaRepository.findById(id);
//        return iNota.get();
//    }

    @GetMapping("/{id}")
    public ItensNota get(@PathVariable("id") Integer id) {
        Optional<ItensNota> iNota = itensNotaRepository.findById(id);
        return iNota.get();
    }

    @GetMapping("/")
    public List<ItensNotaDTO> lista() {
        List<ItensNota> itensNotas = (List<ItensNota>) itensNotaRepository.findAll();
        return ItensNotaDTO.lista(itensNotas);
    }

    @PostMapping("/")
    public ItensNota salvar(@RequestBody ItensNota itensNota){
        itensNota = itensNotaRepository.save(itensNota);
        return itensNota;
    }

    @PutMapping("/")
    public ItensNota alterar(@RequestBody ItensNota itensNota){
        itensNota = itensNotaRepository.save(itensNota);
        return itensNota;
    }

    //Não deleta individualmente o item, necessário deletar a nota fiscal,essa deleterá o item
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id){
        itensNotaRepository.deleteById(id);
    }
}
