package br.com.sonner.cadastroNotaFiscal.orm;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="tb_nota_fiscal")
public class NotaFiscal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
  //  @OneToMany(mappedBy = "tb_cliente")
    private Integer codigo_cliente;
    private LocalDate data_nota;

    public LocalDate getData_nota() {
        return data_nota;
    }

    public void setData_nota(LocalDate data_nota) {
        this.data_nota = data_nota;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer numero) {
        this.codigo = numero;
    }

    public Integer getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(Integer codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }


}
