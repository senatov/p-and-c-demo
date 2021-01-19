package de.senatov.spring.kafka.pandcdemo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class PAndCDemoApplication implements ApplicationRunner {

    private static final Logger LOG = LoggerFactory.getLogger(PAndCDemoApplication.class);



    public static void main(String[] args) {

        SpringApplication.run(PAndCDemoApplication.class, args);
    }



    /**
     * Run.
     *
     * @param args the args
     * @throws Exception the exception
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {

        LOG.debug("start");
    }

}
