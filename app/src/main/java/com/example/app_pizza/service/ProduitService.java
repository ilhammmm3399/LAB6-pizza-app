package com.example.app_pizza.service;

import com.example.app_pizza.classes.Produit;
import com.example.app_pizza.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private List<Produit> produits;

    public ProduitService() {
        this.produits = new ArrayList<>();
    }

    @Override
    public boolean create(Produit o) {
        return produits.add(o);
    }

    @Override
    public boolean update(Produit o) {
        for(Produit p : produits){
            if(p.getId() == o.getId()){
                p.setNom(o.getNom());
                p.setNbrIngredients(o.getNbrIngredients());
                p.setPhoto(o.getPhoto());
                p.setDuree(o.getDuree());
                p.setDetailsIngredients(o.getDetailsIngredients());
                p.setDescription(o.getDescription());
                p.setPreparation(o.getPreparation());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public Produit findById(int id) {
        for(Produit p : produits){
            if(p.getId() == id)
                return p;
        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }
}
