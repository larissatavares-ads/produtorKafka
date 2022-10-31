package br.com.oraculo.produtorKafka.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OraculoModel {
    public String LogSystem;
    public String Application;
    public String DataRequest;
    public String Direction;
    public Integer LogSystemId;
    public Integer ApplicationId;
    public String ApplicationLogMessage;
    public String Status;

    @Override
    public String toString() {
        return "OraculoModel{" +
                "LogSystem=" + LogSystem +
                ", Application=" + Application +
                ", DataRequest=" + DataRequest +
                ", Direction=" + Direction +
                ", LogSystemId=" + LogSystemId +
                ", ApplicationId=" + ApplicationId +
                ", ApplicationLogMessage=" + ApplicationLogMessage +
                ", Status=" + Status +
                "}";
    }
}
