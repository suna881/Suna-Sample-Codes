package com.sunasteffen.gson.models;

public abstract class Animal {
    private String type;
    public abstract void makeSound();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}