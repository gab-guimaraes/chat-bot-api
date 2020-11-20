package com.johnwick182.chatbotdemo.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Message {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long messageId;

    private Long conversationId;

    private String message;

    private String userId;

    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "id_bot")
    private Bot bot;

    public Message(){}

    public Message(Long messageId, Long conversationId, String message, String userId, LocalDateTime timestamp, Bot bot) {
        this.messageId = messageId;
        this.conversationId = conversationId;
        this.message = message;
        this.userId = userId;
        this.timestamp = timestamp;
        this.bot = bot;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public Long getConversationId() {
        return conversationId;
    }

    public void setConversationId(Long conversationId) {
        this.conversationId = conversationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Bot getBot() {
        return bot;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }
}
