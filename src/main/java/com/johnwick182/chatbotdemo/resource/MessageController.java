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
    public @ResponseBody String addMessage(@RequestBody Message message) {
        messageService.save(message);
        return "Saved";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
        public ResponseEntity<Optional<Message>> findById(@PathVariable(value="id") String id) {
        Optional<Message> message = messageService.findById(id);
        return ResponseEntity.ok().body(message);
    }

    @GetMapping(path="/conversation/{id}")
    public List<Message> findByConversation(@PathVariable(value="id") String id) {
        return messageService.findMessagesByConversation(id);
    }
}
