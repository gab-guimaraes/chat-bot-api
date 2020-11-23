package com.johnwick182.chatbotdemo.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Getter
@ToString
@Document("message")
public class Message {

    @Id
    private String id;

    @DateTimeFormat(style = "M-")
    @CreatedDate
    private LocalDateTime timestamp = LocalDateTime.now();

    private String conversationId;

    private String message;

    private String from;

    private String to;
}
