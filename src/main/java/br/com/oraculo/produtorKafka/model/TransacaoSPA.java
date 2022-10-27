package com.oraculo.oraculoservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransacaoSPA {
    public String Codigo;
    public IdentificadorTransacao IdentificadorTransacaoSPA;
    public ProdutoConta DadosProdutoConta;
    public ValoresMovimento DadosValoresMovimento;
    public InfoSPA DadosInfoSPA;

    @Override
    public String toString() {
        return "TransacaoSPA{" +
                "Codigo=" + Codigo +
                ", IdentificadorTransacaoSPA=" + IdentificadorTransacaoSPA +
                ", DadosProdutoConta=" + DadosProdutoConta +
                ", DadosValoresMovimento=" + DadosValoresMovimento +
                ", DadosInfoSPA=" + DadosInfoSPA +
                "}";
    }
}
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class IdentificadorTransacao {
    public Integer Agencia;
    public Integer Posto;
    public String DataContabil;
    public Integer Nsu;

    @Override
    public String toString() {
        return "IdentificadorTransacao{" +
                "Agencia=" + Agencia +
                ", Posto=" + Posto +
                ", DataContabil=" + DataContabil +
                ", Nsu=" + Nsu +
                "}";
    }
}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class ProdutoConta{
    public Integer Banco;
    public Integer Agencia;
    public Integer Posto;
    public Integer Produto;
    public Integer Conta;
    public List<Titular> Titulares;
    public Integer Variacao;
    public Boolean SandBox;

    @Override
    public String toString() {
        return "ProdutoConta{" +
                "Banco=" + Banco +
                ", Agencia=" + Agencia +
                ", Posto=" + Posto +
                ", Produto=" + Produto +
                ", Conta=" + Conta +
                ", Titulares=" + Titulares +
                ", Variacao=" + Variacao +
                ", SandBox=" + SandBox +
                "}";
    }
}
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Titular{
    public String CodigoCliente;
    public String CPFCGCCNPJ;
    public Integer IndicadorTitularidade;
    public String Nome;

    @Override
    public String toString() {
        return "Titular{" +
                "CodigoCliente=" + CodigoCliente +
                ", CPFCGCCNPJ=" + CPFCGCCNPJ +
                ", IndicadorTitularidade=" + IndicadorTitularidade +
                ", Nome=" + Nome +
                "}";
    }
}
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class ValoresMovimento{
    public BigDecimal ValorDinheiro;
    public BigDecimal ValorCheque;

    @Override
    public String toString() {
        return "ValoresMovimento{" +
                "ValorDinheiro=" + ValorDinheiro +
                ", ValorCheque=" + ValorCheque +
                "}";
    }
}
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class InfoSPA{
    public Integer Historico;
    public Integer Documento;
    public String LogSPA;
    public String CMC7;

    @Override
    public String toString() {
        return "InfoSPA{" +
                "Historico=" + Historico +
                ", Documento=" + Documento +
                ", LogSPA=" + LogSPA +
                ", CMC7=" + CMC7 +
                "}";
    }
}

