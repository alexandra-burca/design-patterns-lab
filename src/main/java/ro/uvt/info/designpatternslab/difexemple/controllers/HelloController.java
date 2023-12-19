package ro.uvt.info.designpatternslab.difexemple.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import ro.uvt.info.designpatternslab.model.*;
import ro.uvt.info.designpatternslab.services.*;
import ro.uvt.info.designpatternslab.difexemple.*;
import ro.uvt.info.designpatternslab.difexemple.commands.*;

//@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Controller
public class HelloController {
    private final TransientComponent transientComponent;
    private final ClientComponent clientComponent1;
    private final ClientComponent clientComponent2;

    public HelloController(@Qualifier("clientComponent1") ClientComponent clientComponent1, @Qualifier("clientComponent2") ClientComponent clientComponent2, TransientComponent transientComponent) {
        this.clientComponent1 = clientComponent1;
        this.clientComponent2 = clientComponent2;
        this.transientComponent = transientComponent;
    }
    @RequestMapping(value = "")
    @ResponseBody
    public String hello() {
        return "Hello From Spring Boot!";
    }

    @GetMapping("/hello")
    @ResponseBody
    public void helloComponent() {
        System.out.println("Hello: ");
        this.transientComponent.operation();
    }

    @GetMapping("/client1")
    @ResponseBody
    public void helloClient() {
        System.out.println("ClientComponent1 :");
        this.clientComponent1.operation();
    }

    @GetMapping("/client2")
    @ResponseBody
    public void helloClient2() {
        System.out.println("ClientComponent2 :");
        this.clientComponent2.operation();
    }
}