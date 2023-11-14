package ro.uvt.info.designpatternslab.difexemple.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot!";
    }
}

