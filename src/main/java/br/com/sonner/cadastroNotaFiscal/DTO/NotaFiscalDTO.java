package br.com.sonner.cadastroNotaFiscal.DTO;



import br.com.sonner.cadastroNotaFiscal.model.Cliente;
import br.com.sonner.cadastroNotaFiscal.model.ItensNota;
import br.com.sonner.cadastroNotaFiscal.model.NotaFiscal;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class NotaFiscalDTO {

    private Integer id;
    private String codigo;
    private Date data;
    private Cliente id_cliente;
    private List<ItensNota> itens;


    public NotaFiscalDTO(NotaFiscal notaFiscal) {
        this.id = notaFiscal.getId();
        this.codigo = notaFiscal.getCodigo();
        this.data = notaFiscal.getData_nota();
        this.id_cliente = notaFiscal.getCliente();
        this.itens = notaFiscal.getItens();
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

    public List<ItensNota> getItens() {
        return itens;
    }
}
