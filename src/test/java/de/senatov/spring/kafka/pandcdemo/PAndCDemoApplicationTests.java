package de.senatov.spring.kafka.pandcdemo;



import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;



class PAndCDemoApplicationTests {

    @Autowired
    private ApplicationArguments args;
    @Autowired
    private Logger log;



    /**
     * Context loads.
     */
    @Test
    public void contextLoads() {

        log.debug("Hallo");
    }

}
