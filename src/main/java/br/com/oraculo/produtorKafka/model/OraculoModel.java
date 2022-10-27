package br.com.oraculo.produtorKafka.model;

import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OraculoModel {
    public Origem Origem;
    public Datas Datas;
    public IdentificadorLoteSPA IdentificadorLoteSPA;
    public List<com.oraculo.oraculoservice.model.TransacaoSPA> Transacoes;

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