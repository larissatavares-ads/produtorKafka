package br.com.oraculo.produtorKafka.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IdentificadorLoteSPA {
    public String ChaveIdempotencia;
    public Integer NsuGrupo;

    @Override
    public String toString() {
        return "IdentificadorLoteSPA{" +
                "ChaveIdempotencia='" + ChaveIdempotencia + '\'' +
                ", NsuGrupo='" + NsuGrupo + '\'' +
                '}';
    }
}
