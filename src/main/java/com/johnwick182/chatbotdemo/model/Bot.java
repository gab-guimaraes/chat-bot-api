package com.johnwick182.chatbotdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("bot")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bot {

    @Id
    private String id;

    private String name;
}