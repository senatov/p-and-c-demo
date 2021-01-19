package de.senatov.spring.kafka.pandcdemo.test;



import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;



class PAndCDemoApplicationTests {

    @Autowired
    Logger LOG;



    /**
     * Context loads.
     */
    //private static final Logger LOG = LoggerFactory.getLogger(PAndCDemoApplicationTests.class);
    @Test

    public void contextLoads() {

        LOG.debug("Tests...");

    }

}
