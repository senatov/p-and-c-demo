package de.senatov.spring.kafka.pandcdemo;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/publish")
public class KafkaController {

    private final KafkaProducer producer = null;



    public KafkaController(KafkaProducer producer) {

        producer = producer;
    }


    @PostMapping("/publish")
    private void writeMessageToTopic(@RequestParam("message") String message) {

        producer.writeMessage(message);
    }

}
