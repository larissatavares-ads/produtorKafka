package br.com.oraculo.produtorKafka.model;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OraculoModel {
    public Origem Origem;
    public Datas Datas;
    public IdentificadorLoteSPA IdentificadorLoteSPA;
    public Transacoes Transacoes;

    @Override
    public String toString() {
        return "OraculoModel{" +
                "Origem=" + Origem +
                ", Datas=" + Datas +
                ", IdentificadorLoteSPA=" + IdentificadorLoteSPA +
                ", Transacoes=" + Transacoes +
                '}';
    }
}
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Origem{
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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Datas{
    public String DataContabil;
    public String DataRequest;
    public String DataReply;

    @Override
    public String toString() {
        return "Datas{" +
                "DataContabil='" + DataContabil + '\'' +
                ", DataRequest='" + DataRequest + '\'' +
                ", DataReply='" + DataReply + '\'' +
                '}';
    }
}
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class IdentificadorLoteSPA{
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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Transacoes{
    public String Codigo;

    @Override
    public String toString() {
        return "Transacoes{" +
                "codigo=" + Codigo +
                '}';
    }
}
