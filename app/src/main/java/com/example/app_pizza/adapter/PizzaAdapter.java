package com.example.app_pizza.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app_pizza.R;
import com.example.app_pizza.classes.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {

    private List<Produit> produits;
    private LayoutInflater inflater;
    private Context context;

    public PizzaAdapter(Activity activity, List<Produit> produits) {
        this.produits = produits;
        this.context = activity;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return produits.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.row_pizza, parent, false);

        TextView nom = convertView.findViewById(R.id.pizza_name);
        TextView persons = convertView.findViewById(R.id.pizza_persons);
        TextView duree = convertView.findViewById(R.id.pizza_duration);
        ImageView photo = convertView.findViewById(R.id.pizza_image);

        nom.setText(produits.get(position).getNom());
        persons.setText(String.valueOf(produits.get(position).getNbrIngredients()));
        duree.setText(produits.get(position).getDuree());
        photo.setImageResource(produits.get(position).getPhoto());

        return convertView;
    }
}
