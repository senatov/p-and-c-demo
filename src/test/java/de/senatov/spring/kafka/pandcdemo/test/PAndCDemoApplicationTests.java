package de.senatov.spring.kafka.pandcdemo.test;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import de.senatov.spring.kafka.pandcdemo.KafkaModel;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;



@Slf4j
class PAndCDemoApplicationTests {

    /**
     * Context loads.
     */
    @Test
    public void contextLoads() throws Exception {

        log.debug("Tests...");
        log.debug("contextLoads()");
    }



    @Test
    public void jsonSerializerTest() throws Exception {

        log.debug("jsonSerializerTest()");
        KafkaModel model = new KafkaModel();
        model.setField1("__value001");
        model.setField2("__value002");
        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        // this is not the same typ of object what awaited Kafka:
        // kafka input needs #org.springframework.kafka.support.serializer.JsonSerializer!
        String json = objectWriter.writeValueAsString(model);
        log.debug("\n" + json);
    }

}
