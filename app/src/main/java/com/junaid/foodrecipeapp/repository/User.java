package com.junaid.foodrecipeapp.repository;

import java.util.ArrayList;

public class User {
    long id;
    String name;
    String email;
    String password;
    ArrayList<Long> recipePosted;
    ArrayList<Long> recipeSaved;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.recipePosted = new ArrayList<>();
        this.recipeSaved = new ArrayList<>();
    }

    public long getId() {
        return id;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public ArrayList<Long> getRecipePosted() {
        return recipePosted;
    }
    public void setRecipePosted(ArrayList<Long> recipePosted) {
        this.recipePosted = recipePosted;
    }
    public ArrayList<Long> getRecipeSaved() {
        return recipeSaved;
    }
    public void setRecipeSaved(ArrayList<Long> recipeSaved) {
        this.recipeSaved = recipeSaved;
    }
}
