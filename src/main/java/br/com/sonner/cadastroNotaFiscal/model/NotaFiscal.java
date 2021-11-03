package br.com.sonner.cadastroNotaFiscal.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="tb_nota_fiscal")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class NotaFiscal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String codigo;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    private Date data_nota;

    @OneToMany(mappedBy = "nota", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ItensNota> itens;


    public NotaFiscal(String codigo, Cliente cliente, Date data_nota) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.data_nota = data_nota;
    }

    public NotaFiscal() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData_nota() {
        return data_nota;
    }

    public void setData_nota(Date data_nota) {
        this.data_nota = data_nota;
    }

    public List<ItensNota> getItens() {
        return itens;
    }

    public void setItens(List<ItensNota> itens) {
        this.itens = itens;
    }
}
