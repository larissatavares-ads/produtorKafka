package br.com.oraculo.produtorKafka.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Datas {
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
