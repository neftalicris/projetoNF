package br.com.sonner.cadastroNotaFiscal.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tb_nota_fiscal")
public class NotaFiscal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigo;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    private Date data_nota;
//    @OneToMany(mappedBy = "nota", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private List<ItensNota> itens;


}
