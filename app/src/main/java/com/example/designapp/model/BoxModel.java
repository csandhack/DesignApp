package com.example.designapp.model;

public class BoxModel {

    String first;
    String second;
    int image;

    public BoxModel() {

    }

    public BoxModel(String first, String second, int image) {
        this.first = first;
        this.second = second;
        this.image = image;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
