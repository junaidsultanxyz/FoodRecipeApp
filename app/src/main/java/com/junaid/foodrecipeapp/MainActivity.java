package com.junaid.foodrecipeapp;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.junaid.foodrecipeapp.repository.RecipeApp;
import com.junaid.foodrecipeapp.repository.Recipe;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        initComponents();
        setAdapters();
    }

    private void initComponents() {
        listView = findViewById(R.id.explore_recipe_list);
    }

    private void setAdapters(){
        RecipeMenuAdapter menuAdapter = new RecipeMenuAdapter(this, RecipeApp.sampleRecipeData());
        listView.setAdapter(menuAdapter);
    }
}