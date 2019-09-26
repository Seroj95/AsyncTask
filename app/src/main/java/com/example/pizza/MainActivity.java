package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
RecyclerView.Adapter adapter;
RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<PizzaRecipeItem>pizzaRecipeItems=new ArrayList<>();
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza1,Utils.TITL_1,Utils.DECRIPTION_1,Utils.RECIPT_1));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza2,Utils.TITL_2,Utils.DECRIPTION_2,Utils.RECIPT_2));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza3,Utils.TITL_3,Utils.DECRIPTION_3,Utils.RECIPT_3));
        recyclerView=findViewById(R.id.recivlerview);
        recyclerView.setHasFixedSize(true);
        adapter=new PizzaRecipeAdapter(pizzaRecipeItems,this);
        layoutManager=new LinearLayoutManager(this);
recyclerView.setAdapter(adapter);
recyclerView.setLayoutManager(layoutManager);
    }
}
