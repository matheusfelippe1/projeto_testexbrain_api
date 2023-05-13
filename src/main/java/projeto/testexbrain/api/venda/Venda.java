package projeto.testexbrain.api.venda;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "vendas")
@Entity(name = "Venda")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Venda {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String nomeVendedor;
    private BigDecimal valor;
    private String dataVenda;

    public Venda(DadosCadastroVenda dados) {
        this.nomeVendedor = dados.nomeVendedor();
        this.valor = dados.valor();
        this.dataVenda = dados.dataVenda();
    }
}
