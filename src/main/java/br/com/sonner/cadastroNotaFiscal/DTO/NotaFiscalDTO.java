package br.com.sonner.cadastroNotaFiscal.DTO;



import br.com.sonner.cadastroNotaFiscal.model.Cliente;
import br.com.sonner.cadastroNotaFiscal.model.NotaFiscal;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class NotaFiscalDTO {
    private Integer id;
    private String codigo;
    private Date data;
    private Cliente id_cliente;



    public NotaFiscalDTO(NotaFiscal notaFiscal) {
        this.id = notaFiscal.getId();
        this.codigo = notaFiscal.getCodigo();
        this.data = notaFiscal.getData_nota();
        this.id_cliente = notaFiscal.getCliente();
    }
    public static List<NotaFiscalDTO> lista(List<NotaFiscal> notaFiscal) {
        return notaFiscal.stream().map(NotaFiscalDTO::new).collect(Collectors.toList());
    }

    public Integer getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public Date getData() {
        return data;
    }

    public Cliente getId_cliente() {
        return id_cliente;
    }
}
