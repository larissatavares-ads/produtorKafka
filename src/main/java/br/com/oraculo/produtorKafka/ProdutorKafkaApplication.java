package br.com.oraculo.produtorKafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.web.bind.annotation.RestController;

@EnableKafka
@SpringBootApplication
@RestController
public class ProdutorKafkaApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProdutorKafkaApplication.class, args);
	}
}
