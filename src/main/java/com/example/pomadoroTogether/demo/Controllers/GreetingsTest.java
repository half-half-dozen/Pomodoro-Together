package com.example.pomadoroTogether.demo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsTest {

    @RequestMapping("/test")
    public String printHello(){
        return "INITIAL TEST";
    }
}
