package com.example.app_pizza;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_pizza.classes.Produit;

public class PizzaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        Intent intent = getIntent();
        Produit pizza = (Produit) intent.getSerializableExtra("pizza");

        ImageView pizzaImage = findViewById(R.id.pizza_image_detail);
        TextView pizzaName = findViewById(R.id.pizza_name_detail);
        TextView pizzaDescription = findViewById(R.id.pizza_description_detail);
        TextView pizzaIngredients = findViewById(R.id.pizza_ingredients_detail);
        TextView pizzaPreparation = findViewById(R.id.pizza_preparation_detail);

        pizzaImage.setImageResource(pizza.getPhoto());
        pizzaName.setText(pizza.getNom());
        pizzaDescription.setText(pizza.getDescription());
        pizzaIngredients.setText(pizza.getDetailsIngredients());
        pizzaPreparation.setText(pizza.getPreparation());
    }
}
