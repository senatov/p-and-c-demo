package de.senatov.spring.kafka.pandcdemo;



import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;



@Data
@Component
public class KafkaModel implements Serializable {

    private static final long serialVersionUID = 1671862795996898048L;
    private String field1;
    private String field2;

}
