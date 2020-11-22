package com.johnwick182.chatbotdemo.resource;


import com.johnwick182.chatbotdemo.model.Message;
import com.johnwick182.chatbotdemo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping(path="/")
    public ResponseEntity<Message> addMessage(@RequestBody Message message) {
        return ResponseEntity.ok(messageService.save(message));
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
        public ResponseEntity<Optional<Message>> findById(@PathVariable(value="id") String id) {
        Optional<Message> message = messageService.findById(id);
        return ResponseEntity.ok().body(message);
    }

    @GetMapping(path="/conversation/{id}")
    public ResponseEntity<List<Message>> findByConversation(@PathVariable(value="id") String id) {
        return ResponseEntity.ok(messageService.findMessagesByConversation(id));
    }
}
