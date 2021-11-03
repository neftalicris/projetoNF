package br.com.sonner.cadastroNotaFiscal.controller;

import br.com.sonner.cadastroNotaFiscal.DTO.ClienteDTO;
import br.com.sonner.cadastroNotaFiscal.DTO.ProdutoDTO;
import br.com.sonner.cadastroNotaFiscal.controller.form.ClienteFormDTO;
import br.com.sonner.cadastroNotaFiscal.controller.form.ProdutoFormDTO;
import br.com.sonner.cadastroNotaFiscal.model.Cliente;
import br.com.sonner.cadastroNotaFiscal.model.NotaFiscal;
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
import java.util.Optional;

//@Controller
@RestController
@RequestMapping("/produto")
public class ProdutosController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/{id}")
    public Produto get(@PathVariable("id") Integer id) {
        Optional<Produto> prod = produtoRepository.findById(id);
        return prod.get();
    }


    @GetMapping("/")
    public List<ProdutoDTO> lista(){
        List<Produto> produtos = (List<Produto>) produtoRepository.findAll();
        return ProdutoDTO.lista(produtos);
    }


    @PostMapping("/")
    public Produto salvar(@RequestBody Produto produto){
        produto = produtoRepository.save(produto);
        return produto;
    }
    @PutMapping("/")
    public Produto alterar(@RequestBody Produto produto){
        produto = produtoRepository.save(produto);
        return produto;
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id){
        produtoRepository.deleteById(id);
    }

}
