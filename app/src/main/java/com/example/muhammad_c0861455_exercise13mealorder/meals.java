package com.example.muhammad_c0861455_exercise13mealorder;

public class meals {
    meals[] meals = {new meals("Biryani", 12), new meals("Chicken Burger",10), new meals("Butter Chicken",14)};

    private String name;
    private double price;

    public meals(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public com.example.muhammad_c0861455_exercise13mealorder.meals[] getMeals() {
        return meals;
    }

    public void setMeals(com.example.muhammad_c0861455_exercise13mealorder.meals[] meals) {
        this.meals = meals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
