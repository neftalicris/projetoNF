package br.com.sonner.cadastroNotaFiscal.orm;

import javax.persistence.*;

@Entity
@Table(name="tb_itens_notas")
public class ItensNota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigo_item;

    private Integer codigo_produto;
    private Double quantidade;

    private Integer codigo_nota;


}
