package de.senatov.spring.kafka.pandcdemo;



import lombok.Data;
import org.springframework.context.annotation.Configuration;



@Data
@Configuration
public class KafkaModel {

    private static final long serialVersionUID = 1671862795996898048L;
    private String field1;
    private String field2;

}
