package br.com.sonner.cadastroNotaFiscal.orm;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="tb_nota_fiscal")
public class NotaFiscal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigo;
    private Integer codigo_cliente;
    private LocalDate data_nota;


}
