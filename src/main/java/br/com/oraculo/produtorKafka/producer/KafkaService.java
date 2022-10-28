package br.com.oraculo.produtorKafka.producer;

import br.com.oraculo.produtorKafka.model.OraculoModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Slf4j
@Service
public class KafkaService {
    private final KafkaTemplate<String, OraculoModel> kafkaTemplate;
    private final String topic = "MENSAGEM_ORACULO";

    public KafkaService(KafkaTemplate<String, OraculoModel> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void send(OraculoModel message) {
        log.info("Payload enviado: {}", message);

        ListenableFuture<SendResult<String, OraculoModel>> future = this.kafkaTemplate.send(topic, message);

        future.addCallback(new ListenableFutureCallback<>() {
            @Override
            public void onFailure(Throwable ex) {
                log.info("Unable to send message=[ {} ] due to : {}", message, ex.getMessage());
            }
            @Override
            public void onSuccess(SendResult<String, OraculoModel> result) {
                log.info("Sent message=[ {} ] with offset=[ {} ]", message, result.getRecordMetadata().offset());
            }
        });
    }
}
