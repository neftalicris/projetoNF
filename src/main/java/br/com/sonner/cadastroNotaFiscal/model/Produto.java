package br.com.sonner.cadastroNotaFiscal.orm;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="tb_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigo;
    private String descricao;
    private BigDecimal valor_unitario;


}

