package com.example.myapplication;

public class Salads {
    private String name;
    private String description;
    private int imageResourceId;

    public Salads(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public static final Salads[] salads = {
            new Salads("Caesar Salad", "Classic Caesar salad with romaine lettuce, croutons, and Caesar dressing", R.drawable.cesar),
            new Salads("Quinoa Salad", "Healthy quinoa salad with mixed greens, veggies, and a light lemon dressing", R.drawable.kenoa),
            new Salads("Fattoush", "Traditional Fattoush salad with fresh vegetables, herbs, and crispy pita bread", R.drawable.fatosh),
            new Salads("Greek Salad", "Refreshing Greek salad with tomatoes, cucumbers, olives, and feta cheese", R.drawable.yunani)
    };


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
