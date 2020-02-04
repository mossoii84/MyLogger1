package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyLogger1Application {

    // это для Loggirovaniya
//      private static Logger LOGGER = LogManager.getLogger(SqlQueryTest1Application.class);

    public static void main(String[] args) {
        SpringApplication.run(MyLogger1Application.class, args);
    }


    // это для Loggirovaniya
//        LOGGER.debug("Debug level log message");
//        log.info("Info level log message");
//        log.debug("Debug level log message");
//        log.error("Error level log message");
}
