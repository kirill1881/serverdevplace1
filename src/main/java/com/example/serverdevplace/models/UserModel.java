package com.example.serverdevplace.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "devplace_users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "person_name")
    private String name;

    @Column(name = "chat_id")
    private String chatId;

    @Column(name = "nick")
    private String nick;

    @Column(name = "number")
    private String number;

    @Column(name = "result")
    private int result;

    @Column(name = "comment")
    private String comment;

}

