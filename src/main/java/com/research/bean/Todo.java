package com.research.bean;

import java.util.Date;

public class Todo {
    private int id;
    private String user;

    private String desc;

    private Date targetDate;
    private boolean isDone;

    public Todo() {}

    public Todo(int id, String user, String desc,
                Date targetDate, boolean isDone) {
        super();
        this.id = id;
        this.user = user;
        this.desc = desc;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    //ALL Getters
    public String getUser() {
        return this.user;
    }
    public int getId() {
        return this.id;
    }
}