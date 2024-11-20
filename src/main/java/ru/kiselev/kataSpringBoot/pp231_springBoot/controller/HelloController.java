package ru.kiselev.kataSpringBoot.pp231_springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping()
    public String printHelloPage() {
        return "hello/hello_page";
    }
}
