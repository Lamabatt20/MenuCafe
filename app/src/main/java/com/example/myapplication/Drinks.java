package com.example.myapplication;

public class Drinks {
    private String name;
    private String description;
    private int imageResourceId;
    public static final Drinks[] drinks = {
            new Drinks("Spanish Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drinks("Coffee", "Classic brewed coffee", R.drawable.logo),
            new Drinks("Ice Coffee", "Chilled coffee served with ice, perfect for a refreshing boost", R.drawable.hom),
            new Drinks("Strawberry Milkshake", "A creamy, delicious milkshake with fresh strawberries and milk", R.drawable.image),
            new Drinks("Tea", "A soothing cup of tea made from freshly brewed tea leaves", R.drawable.dr)
    };


    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public Drinks(String name,String description,int imageResourceId) {
        this.name=name;
        this.description=description;
        this.imageResourceId=imageResourceId;

    }

    @Override
    public String toString() {
        return this.name;
    }
}
