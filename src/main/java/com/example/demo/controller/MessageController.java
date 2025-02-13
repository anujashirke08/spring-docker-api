package com.example.demo.controller;

import com.example.demo.model.MessageRequest;
import com.example.demo.model.MessageResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MessageController {

    @PostMapping("/message")
    public MessageResponse receiveMessage(@RequestBody MessageRequest request) {
        return new MessageResponse("Received: " + request.getMessage());
    }
}
