package com.johnwick182.chatbotdemo.repository;

import com.johnwick182.chatbotdemo.model.Bot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface BotRepository extends MongoRepository<Bot, String> {
}

