package com.johnwick182.chatbotdemo.repository;

import com.johnwick182.chatbotdemo.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends MongoRepository<Message, String> {
    @Query("{ 'conversationId' : ?0 }")
    List<Message> findMessageBtConversationId(String id);
}
