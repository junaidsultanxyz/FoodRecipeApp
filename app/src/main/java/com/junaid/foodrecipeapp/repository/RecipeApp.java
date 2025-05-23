package com.junaid.foodrecipeapp.repository;

import java.util.ArrayList;

public class RecipeApp {
    static final int max_tags = 5;

    static ArrayList<User> userList = new ArrayList<>();
    static ArrayList<Recipe> recipes = new ArrayList<>();

    public RecipeApp() {
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }


    public static ArrayList<Recipe> sampleRecipeData(){
        Recipe recipe1 = new Recipe("Pancakes", "Breakfast",
                "niggers",
                "baking powder\nbaking sode\nmilk\neggs\noil\nsugar",
                "just make it");
        recipe1.addTag("Breakfast");
        recipe1.addTag("Baking");
        recipe1.addTag("Cake");

        recipes.add(recipe1);

        Recipe recipe2 = new Recipe("Pancakes 2", "Baking",
                "niggers",
                "baking powder\nbaking sode\nmilk\neggs\noil\nsugar",
                "just make it");
        recipe2.addTag("Breakfast");
        recipe2.addTag("Baking");
        recipe2.addTag("Cake");

        recipes.add(recipe2);

        Recipe recipe6 = new Recipe("Pancakes", "Breakfast",
                "niggers",
                "baking powder\nbaking sode\nmilk\neggs\noil\nsugar",
                "just make it");
        recipe6.addTag("Breakfast");
        recipe6.addTag("Baking");
        recipe6.addTag("Cake");

        recipes.add(recipe6);

        Recipe recipe3 = new Recipe("Pancakes 2", "Baking",
                "niggers",
                "baking powder\nbaking sode\nmilk\neggs\noil\nsugar",
                "just make it");
        recipe3.addTag("Breakfast");
        recipe3.addTag("Baking");
        recipe3.addTag("Cake");

        recipes.add(recipe3);

        Recipe recipe4 = new Recipe("Pancakes", "Breakfast",
                "niggers",
                "baking powder\nbaking sode\nmilk\neggs\noil\nsugar",
                "just make it");
        recipe4.addTag("Breakfast");
        recipe4.addTag("Baking");
        recipe4.addTag("Cake");

        recipes.add(recipe4);

        Recipe recipe5 = new Recipe("Pancakes 2", "Baking",
                "niggers",
                "baking powder\nbaking sode\nmilk\neggs\noil\nsugar",
                "just make it");
        recipe5.addTag("Breakfast");
        recipe5.addTag("Baking");
        recipe5.addTag("Cake");

        recipes.add(recipe5);

        return recipes;
    }
}
