package br.com.oraculo.produtorKafka.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Origem {
    public Integer Banco;
    public Integer Agencia;
    public Integer Canal;
    public String IpOrigem;
    public String Estacao;
    public Integer Posto;
    public String Operador;
    public String Supervisor;

    @Override
    public String toString() {
        return "Origem{" +
                "Banco='" + Banco + '\'' +
                ", Agencia='" + Agencia + '\'' +
                ", Canal='" + Canal + '\'' +
                ", IpOrigem='" + IpOrigem + '\'' +
                ", Estacao='" + Estacao + '\'' +
                ", Posto='" + Posto + '\'' +
                ", Operador='" + Operador + '\'' +
                ", Supervisor='" + Supervisor + '\'' +
                '}';
    }
}
