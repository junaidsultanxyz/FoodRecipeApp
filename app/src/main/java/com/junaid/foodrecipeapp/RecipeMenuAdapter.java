package com.junaid.foodrecipeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.junaid.foodrecipeapp.repository.Recipe;
import com.junaid.foodrecipeapp.style.InsertTag;

import java.util.ArrayList;

public class RecipeMenuAdapter extends BaseAdapter {
    private final Context context;
    private final ArrayList<Recipe> recipes;

    public RecipeMenuAdapter(Context context, ArrayList<Recipe> recipe_list) {
        this.context = context;
        this.recipes = recipe_list;
    }

    @Override
    public int getCount() {
        return recipes.size();
    }

    @Override
    public Object getItem(int i) {
        return recipes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.explore_recipe_list_item, null);
        }

        ImageView image = convertView.findViewById(R.id.list_item_image);
        TextView category = convertView.findViewById(R.id.list_item_category);
        TextView name = convertView.findViewById(R.id.list_item_name);

        LinearLayout linear_tag_layout = convertView.findViewById(R.id.list_item_tags);

        image.setImageURI(recipes.get(position).getImage());
        category.setText(recipes.get(position).getCategory());
        name.setText(recipes.get(position).getName());

        linear_tag_layout.removeAllViewsInLayout();
        for (String tag: recipes.get(position).getTags()){
            linear_tag_layout.addView(InsertTag.InsertTag(convertView.getContext(), convertView, tag));
        }

        return convertView;
    }
}
