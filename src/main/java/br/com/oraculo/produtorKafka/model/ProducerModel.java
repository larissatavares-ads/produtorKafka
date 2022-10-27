package br.com.oraculo.produtorKafka.model;

public class ProducerModel {
    private String mensagem;

    public ProducerModel(String mensagem) {
        this.mensagem = mensagem;
    }

    public ProducerModel() {
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
