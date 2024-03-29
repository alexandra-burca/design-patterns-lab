package ro.uvt.info.designpatternslab.difexemple.controllers;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import ro.uvt.info.designpatternslab.difexemple.SseObserver;


import java.nio.channels.SelectionKey;

@RestController
public class BooksSseController {
    @RequestMapping("/books-sse")
    public ResponseBodyEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L);
        SelectionKey allBooksSubject = null;
        allBooksSubject.attach(new SseObserver(emitter));
        return emitter;
    }
}
