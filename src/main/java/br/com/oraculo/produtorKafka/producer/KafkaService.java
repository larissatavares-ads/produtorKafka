package br.com.oraculo.produtorKafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Slf4j
@Service
public class KafkaService {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String topic = "MENSAGEM_ORACULO";

    public KafkaService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void send(String message) {
        log.info("Payload enviado: {}", message);

        ListenableFuture<SendResult<String, String>> future = this.kafkaTemplate.send(topic, message);

        future.addCallback(new ListenableFutureCallback<>() {
            @Override
            public void onFailure(Throwable ex) {
                log.info("Unable to send message=[ {} ] due to : {}", message, ex.getMessage());
            }
            @Override
            public void onSuccess(SendResult<String, String> result) {
                log.info("Sent message=[ {} ] with offset=[ {} ]", message, result.getRecordMetadata().offset());
            }
        });
    }
}
