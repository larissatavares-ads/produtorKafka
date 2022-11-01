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
    public String System;
    public String Application;
    public String DateLogRequest;
    public String OraculoID;
    public String Direction;
    public String ApplicationID;
    public String ApplicationLogMessage;
    public String Status;

    @Override
    public String toString() {
        return "OraculoModel{" +
                "System=" + System +
                ", Application=" + Application +
                ", DateLogRequest=" + DateLogRequest +
                ", OraculoID=" + OraculoID +
                ", Direction=" + Direction +
                ", ApplicationId=" + ApplicationID +
                ", ApplicationLogMessage=" + ApplicationLogMessage +
                ", Status=" + Status +
                "}";
    }
}
