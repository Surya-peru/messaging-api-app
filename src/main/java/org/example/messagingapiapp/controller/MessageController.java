package org.example.messagingapiapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    // URL: http://localhost:9091/
    @GetMapping("/")
    public String print() {
        return "Hi Guest !!";
    }

    // URL: http://localhost:9091/oracle
    @GetMapping("/oracle")
    public String printGreetings() {
        return "Hi Oracle !!";
    }
}