package com.johnwick182.chatbotdemo.resource;


import com.johnwick182.chatbotdemo.model.Bot;
import com.johnwick182.chatbotdemo.model.Message;
import com.johnwick182.chatbotdemo.repository.BotRepository;
import com.johnwick182.chatbotdemo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/message")
public class MessageController {

    @Autowired
    private MessageRepository repository;

    @GetMapping("/all")
    public List<Message> getBots() {
        return (List<Message>) repository.findAll();
    }

}
