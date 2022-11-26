package com.QrIzZ.bookOfRecipes;

import com.QrIzZ.bookOfRecipes.Recipes.recipes;

public class Main {
    static recipes recipes = new recipes();

    public static void main(String[] args) {
        System.out.println("Hello world!");
        recipes.recept();
    }
}
