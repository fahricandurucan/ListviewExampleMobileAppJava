package com.example.listviewexamplemobileappjava;

public class Animal {
    private  String type;
    private  int imageId;

    public Animal(String type, int imageId) {
        this.type = type;
        this.imageId = imageId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
