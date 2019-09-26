package com.example.pizza;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PizzaRecipeAdapter extends RecyclerView.Adapter <PizzaRecipeAdapter.PizzaRecipeViewHolder>{
    ArrayList<PizzaRecipeItem>pizzaRecipeItems;
Context context;
    public PizzaRecipeAdapter(ArrayList<PizzaRecipeItem> pizzaRecipeItems,Context context) {
        this.pizzaRecipeItems = pizzaRecipeItems;
        this.context=context;
    }

    @NonNull
    @Override
    public PizzaRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.pizza_recip_item, parent, false);
       PizzaRecipeViewHolder pizzaRecipeViewHolder=new PizzaRecipeViewHolder(view);
        return pizzaRecipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaRecipeViewHolder holder, int position) {
        PizzaRecipeItem pizzaRecipeItem =pizzaRecipeItems.get(position);
        holder.pizzaImageView.setImageResource(pizzaRecipeItem.getImageRecours());
        holder.title.setText(pizzaRecipeItem.getTitle());
        holder.descreption.setText(pizzaRecipeItem.getDescreption());

    }

    @Override
    public int getItemCount() {
        return pizzaRecipeItems.size();
    }

    class PizzaRecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
public ImageView pizzaImageView;
public TextView title;
public  TextView descreption;
        public PizzaRecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            pizzaImageView=itemView.findViewById(R.id.pizzaImageView);
            title=itemView.findViewById(R.id.titleTextView);
            descreption=itemView.findViewById(R.id.descreptionTextView);

        }

        @Override
        public void onClick(View v) {
            int possiton =getAdapterPosition();
            PizzaRecipeItem pizzaRecipeItem = pizzaRecipeItems.get(possiton);
            Intent intent =new Intent(context,RecipeActivity.class);
            intent.putExtra("image",pizzaRecipeItem.getImageRecours());
            intent.putExtra("title",pizzaRecipeItem.getTitle());
            intent.putExtra("desc",pizzaRecipeItem.getDescreption());
            intent.putExtra("recept",pizzaRecipeItem.getRecept());
            context.startActivity(intent);
        }
    }
}
