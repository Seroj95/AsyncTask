package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        TextView title= findViewById(R.id.titleView);
        TextView recept=findViewById(R.id.recipeTextView);

        Intent intent=getIntent();
        if (intent != null){
title.setText(intent.getStringExtra("title"));
recept.setText(intent.getStringExtra("recept"));
        }
    }
}
