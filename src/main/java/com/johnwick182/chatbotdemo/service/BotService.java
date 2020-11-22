package com.johnwick182.chatbotdemo.service;

import com.johnwick182.chatbotdemo.model.Bot;
import com.johnwick182.chatbotdemo.repository.BotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BotService {

    @Autowired
    private BotRepository botRepository;

    public Bot save(Bot bot) {
        return botRepository.save(bot);
    }

    public List<Bot> findAll() {
        return botRepository.findAll();
    }

    public Optional<Bot> findById(String id) {
        return botRepository.findById(id);
    }

    public void deleteById(String id){
        botRepository.deleteById(id);
    }

    public Bot updateById(Bot bot) {
       return botRepository.save(bot);
    }

}
