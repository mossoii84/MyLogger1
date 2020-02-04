package com.example.demo.ControllerMy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j2;


@Log4j2
@RestController
public class ControllerMy {

//в этом Контроллере ничего не делается, это просто тестовый вариант из друговов примера, чтобы понять как что куда пишеться

        @GetMapping(value="/orderscustomers")
        public String getAll2(){

            // это для Loggirovaniya
//        LOGGER.debug("Debug level log message");
//        log.error("Error level log message");
//     log.info("list orders");
//     log.debug("list orders");
            log.warn("list orders");  // тут log красный, но работает
           return ("Привет Андрей");
        }

    }


