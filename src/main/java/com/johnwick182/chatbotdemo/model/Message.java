package com.johnwick182.chatbotdemo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@ToString
@Document("message")
public class Message {

    @Id
    private String id;

    private String conversationId;

    private String message;

    private String from;

    private String to;
}
