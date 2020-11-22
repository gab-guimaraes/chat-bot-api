package com.johnwick182.chatbotdemo.service;

import com.johnwick182.chatbotdemo.model.Message;
import com.johnwick182.chatbotdemo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public Message save(Message message) {
        return messageRepository.save(message);
    }

    public Optional<Message> findById(String id) {
        return messageRepository.findById(id);
    }

    public List<Message> findMessagesByConversation(String idConversation){
       return messageRepository.findMessageBtConversationId(idConversation);
    }
}
