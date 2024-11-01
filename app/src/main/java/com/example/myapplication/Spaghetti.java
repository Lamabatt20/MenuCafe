package com.example.myapplication;

public class Spaghetti {
    private String name;
    private String description;
    private int imageResourceId;

    public Spaghetti(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public static final Spaghetti[] spaghetti = {
            new Spaghetti("Spaghetti Bolognese", "Classic spaghetti topped with rich Bolognese sauce and parmesan cheese.", R.drawable.bolognese),
            new Spaghetti("Spaghetti Aglio e Olio", "Simple and flavorful spaghetti with garlic, olive oil, and chili flakes.", R.drawable.olie),
            new Spaghetti("Spaghetti Carbonara", "Creamy carbonara made with eggs, cheese, pancetta, and black pepper.", R.drawable.carbonara),
            new Spaghetti("Vegetable Spaghetti", "Healthy spaghetti tossed with fresh vegetables and light olive oil.", R.drawable.vegetable)
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
