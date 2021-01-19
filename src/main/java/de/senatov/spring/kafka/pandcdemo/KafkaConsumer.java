package de.senatov.spring.kafka.pandcdemo;



import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;



@Service
public class KafkaConsumer {

    @Autowired
    private Logger log;



    @KafkaListener
    public void getMessage(String message) {

        log.debug(message);
    }

}
