package com.junaid.foodrecipeapp.repository;
/*
    1427565591
    7255
 */

import android.net.Uri;

import java.util.ArrayList;

public class Recipe {
    long id;
    Uri image;
    String name;
    String category;
    String description;
    String ingredients;
    String instructions;
    ArrayList<String> tags;

    public Recipe(Uri image, String name, String category, String description, String ingredients, String instructions, ArrayList<String> tags) {
        this.image = image;
        this.name = name;
        this.category = category;
        this.description = description;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.tags = tags;
    }

    public Recipe(String name, String category, String description, String ingredients, String instructions) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.tags = new ArrayList<>(5);
    }

    public long getId() {
        return id;
    }
    public Uri getImage() {
        return image;
    }
    public void setImage(Uri image) {
        this.image = image;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getIngredients() {
        return ingredients;
    }
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
    public String getInstructions() {
        return instructions;
    }
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    public ArrayList<String> getTags() {
        return tags;
    }


    public void addTag(String tag){
        tags.add(tag);
    }
}