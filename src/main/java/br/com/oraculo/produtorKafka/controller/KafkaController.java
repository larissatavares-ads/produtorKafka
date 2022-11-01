package br.com.oraculo.produtorKafka.controller;

import br.com.oraculo.produtorKafka.model.OraculoModel;
import org.springframework.web.bind.annotation.*;
import br.com.oraculo.produtorKafka.producer.KafkaService;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private final KafkaService topicProducer;

    public KafkaController(KafkaService topicProducer) {
        this.topicProducer = topicProducer;
    }

    @PostMapping("/publish")
    public void send(@RequestBody OraculoModel message){
        topicProducer.send(message);
    }
}
