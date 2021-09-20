package br.com.sonner.cadastroNotaFiscal.controller;

import br.com.sonner.cadastroNotaFiscal.DTO.ClienteDTO;
import br.com.sonner.cadastroNotaFiscal.controller.form.ClienteFormDTO;
import br.com.sonner.cadastroNotaFiscal.model.Cliente;
import br.com.sonner.cadastroNotaFiscal.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.swing.text.TabExpander;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<ClienteDTO> lista() {
        List<Cliente> clientes = (List<Cliente>) clienteRepository.findAll();
        return ClienteDTO.lista(clientes);

    }
    @PostMapping("/")
    public Cliente salvar(@RequestBody Cliente cliente){
        cliente = clienteRepository.save(cliente);
        return cliente;
    }
    @PutMapping("/")
    public Cliente alterar(@RequestBody Cliente cliente){
        cliente = clienteRepository.save(cliente);
        return cliente;
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id){
        clienteRepository.deleteById(id);
    }
//    public ResponseEntity<ClienteDTO> cadastrar(@RequestBody ClienteFormDTO clienteForm, UriComponentsBuilder uriBuilder){
//        Cliente cliente = clienteForm.converter();
//        clienteRepository.save(cliente);
//        URI uri = uriBuilder.path("/cliente/{id}").buildAndExpand(cliente.getId()).toUri();
//        return ResponseEntity.created(uri).body(new ClienteDTO(cliente));
//    }
}
