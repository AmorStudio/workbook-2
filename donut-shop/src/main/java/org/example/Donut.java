package org.example;

public class Donut {
    String type;
    int calories;
    double price;
    String description;

    Donut(String type, int calories, double price, String description) {
        this.type = type;
        this.calories = calories;
        this.price = price;
        this.description = description;
    }

    public String toString() {
        return "Donut: {type: " + type + " calories: " + calories + " price: " + price + " description: " + description + "}";

    }

    public String whatIsType()

    {
        return type;
    }

    public int whatIsCalories()
    {
        return calories;
    }

    public double whatIsPrice()

    {
        return price;

    }

    public String whatIsDescription()
    {
        return description;
    }
}

