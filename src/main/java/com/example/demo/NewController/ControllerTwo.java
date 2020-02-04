package com.example.demo.NewController;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class ControllerTwo {

    @GetMapping(value="/orderscustomers2")
    public String getAll(){

        // это для Loggirovaniya
        log.warn("list ");  // тут log красный, но работает
        return ("Привет Конь2");
    }
}
