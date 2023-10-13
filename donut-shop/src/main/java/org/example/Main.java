package org.example;

public class Main {
    public static void main(String[] args) {
        Donut[] whatISYourType = new Donut[6];

        String[] type = {"Glazed", "Chocolate", "Pumpkin", "Jelly", "10 ct Assorted Munchkins", "Blueberry"};
        int[] calories = {200, 200, 200, 200, 160, 200};
        double []  price = {1.5,1.5,1.5,1.5,2.0,1.5};
        String[] description = {"Classic Donut", " Original Chocolate frosted NO sprinkles", "Pumpkin Spice Limited-time only", "Original Glazed with filling", "Variety of Sweets", "Extremely Flattering Blueberry: You Doughnot want to miss" };

        for (int i = 0; i < whatISYourType.length; i++) {
            whatISYourType [i] = new Donut(type[i],calories[i],price [i],description[i]);
        }
        for (Donut donut: whatISYourType) {
            System.out.println(donut);
        }
    }
}
