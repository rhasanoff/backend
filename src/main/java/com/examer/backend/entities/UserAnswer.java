package com.examer.backend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String user_answer;
    private int mark;

    public long getId() {
        return id;
    }

    public String getUser_answer() {
        return user_answer;
    }

    public int getMark() {
        return mark;
    }
}
