package com.johnwick182.chatbotdemo.repository;

import com.johnwick182.chatbotdemo.model.Bot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotRepository extends CrudRepository<Bot, Integer> {
}


