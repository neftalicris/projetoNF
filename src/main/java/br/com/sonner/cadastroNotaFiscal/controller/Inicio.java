package br.com.sonner.cadastroNotaFiscal.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Inicio {
    @RequestMapping("/")
    @ResponseBody
    public String telaInicial(){
        return "Cadastro Nota Fiscal";
    }
}
