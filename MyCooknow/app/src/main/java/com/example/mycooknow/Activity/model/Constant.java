package com.example.mycooknow.Activity.model;

public class Constant
{
    int image;
    String title;
    String ejza;
    String targeeb;

    public Constant(int image, String title, String ejza, String targeeb) {
        this.image = image;
        this.title= title;
        this.ejza = ejza;
        this.targeeb = targeeb;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getEjza() {
        return ejza;
    }

    public String getTargeeb() {
        return targeeb;
    }
}
