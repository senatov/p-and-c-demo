package de.senatov.spring.kafka.pandcdemo.logging;



import org.slf4j.Logger;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.lang.reflect.Member;

import static java.lang.System.err;
import static java.util.Optional.of;
import static org.slf4j.LoggerFactory.getLogger;



/**
 * The type Logging configuration.
 */
@Configuration
public class LoggingConfiguration {

    private static final String OCCURED_S_N = "slf4j autowired Exception occured : %s%n";



    /**
     * Log logger.
     *
     * @param ip the ip
     * @return the logger
     */
    @Bean
    @Scope("prototype")
    public Logger log(InjectionPoint ip) {

        try {
            return getLogger(of(ip.getMember()).map(Member::getDeclaringClass).orElseThrow(IllegalArgumentException::new));
        } catch (Exception e) {
            err.printf(OCCURED_S_N, e.getMessage());
            throw e;
        }
    }

}

