package com.example.recyclerview;

public class MenuItem {

    //fields
    private String name,breed;
    public int imageid;


    //constructor
    public MenuItem(String name, String breed, int imageid) {
        this.name = name;
        this.breed = breed;
        this.imageid = imageid;

    }

    //getters and setters


    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
