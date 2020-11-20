package com.johnwick182.chatbotdemo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bot")
public class Bot {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "cod")
    private Long idBot;

    private String name;

    public Long getIdBot() {
        return idBot;
    }

    public void setIdBot(Long idBot) {
        this.idBot = idBot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bot(){}
}
