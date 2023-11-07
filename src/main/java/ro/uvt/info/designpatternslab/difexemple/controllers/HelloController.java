package ro.uvt.info.designpatternslab.difexemple.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot!";
    }
}
