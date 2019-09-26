package com.example.pizza;

public class PizzaRecipeItem {
    private int imageRecours;
    private String title;
    private String descreption;
    private String recept;

    public PizzaRecipeItem(int imageRecours, String title, String descreption, String recept) {
        this.imageRecours = imageRecours;
        this.title = title;
        this.descreption = descreption;
        this.recept = recept;
    }

    public int getImageRecours() {
        return imageRecours;
    }

    public String getTitle() {
        return title;
    }

    public String getDescreption() {
        return descreption;
    }

    public String getRecept() {
        return recept;
    }
}
