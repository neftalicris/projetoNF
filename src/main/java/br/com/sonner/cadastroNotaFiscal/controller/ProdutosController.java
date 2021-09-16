package br.com.sonner.cadastroNotaFiscal.controller;

import br.com.sonner.cadastroNotaFiscal.DTO.ClienteDTO;
import br.com.sonner.cadastroNotaFiscal.DTO.ProdutoDTO;
import br.com.sonner.cadastroNotaFiscal.controller.form.ClienteFormDTO;
import br.com.sonner.cadastroNotaFiscal.controller.form.ProdutoFormDTO;
import br.com.sonner.cadastroNotaFiscal.model.Cliente;
import br.com.sonner.cadastroNotaFiscal.model.Produto;
import br.com.sonner.cadastroNotaFiscal.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

//@Controller
@RestController
@RequestMapping("/produto")
public class ProdutosController {

    @Autowired
    private ProdutoRepository produtoRepository;


    @GetMapping
    public List<ProdutoDTO> lista(){
        List<Produto> produtos = (List<Produto>) produtoRepository.findAll();
        return ProdutoDTO.lista(produtos);
    }
    @PostMapping
    public ResponseEntity<ProdutoDTO> cadastrar(@RequestBody ProdutoFormDTO produtoForm, UriComponentsBuilder uriBuilder){
        Produto produto = produtoForm.converter();
        produtoRepository.save(produto);
        URI uri = uriBuilder.path("/produto/{id}").buildAndExpand(produto.getId()).toUri();
        return ResponseEntity.created(uri).body(new ProdutoDTO(produto));
    }
}
