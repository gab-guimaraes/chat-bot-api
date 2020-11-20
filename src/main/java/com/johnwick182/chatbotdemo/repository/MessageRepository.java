package com.johnwick182.chatbotdemo.repository;

import com.johnwick182.chatbotdemo.model.Bot;
import com.johnwick182.chatbotdemo.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {
}
