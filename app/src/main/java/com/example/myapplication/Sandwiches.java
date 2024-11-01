package com.example.myapplication;

public class Sandwiches {
    private String name;
    private String description;
    private int imageResourceId;

    public Sandwiches(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public static final Sandwiches[] sandwiches = {
            new Sandwiches("Club Sandwich", "A classic club sandwich with layers of turkey, bacon, lettuce, and tomato.", R.drawable.club),
            new Sandwiches("Zinger Sandwich", "Spicy Zinger sandwich with crispy fried chicken and fresh vegetables.", R.drawable.sandwich),
            new Sandwiches("Cheeseburger", "Juicy cheeseburger topped with melted cheese, lettuce, and tomato.", R.drawable.cheese),
            new Sandwiches("Veggie Sandwich", "Healthy veggie sandwich loaded with fresh vegetables and hummus.", R.drawable.veggie)
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

