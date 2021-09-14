package br.com.sonner.cadastroNotaFiscal.controller;

import br.com.sonner.cadastroNotaFiscal.DTO.ProdutoDTO;
import br.com.sonner.cadastroNotaFiscal.model.Produto;
import br.com.sonner.cadastroNotaFiscal.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//@Controller
@RestController
public class ProdutosController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping("/produtos")
//    @ResponseBody
    public List<ProdutoDTO> lista(){
//        Produto produto = new Produto(1,"1","MOUSE");
//        return ProdutoDTO.lista(Arrays.asList(produto));
        List<Produto> produtos = (List<Produto>) produtoRepository.findAll();
        return ProdutoDTO.lista(produtos);
    }
}
