package com.example.customrecycler;

public class GameModel {
    int image;
    String name,country,people;

    public GameModel(int image, String name, String country, String people) {
        this.image = image;
        this.name = name;
        this.country = country;
        this.people = people;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }
}

