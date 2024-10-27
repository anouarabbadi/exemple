package com.example.tp.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "category")
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    List<Produit> produits;

    @OneToOne
    @JoinColumn(name = "id")
    private Promotion promotion;

    public Category(int id, List<Produit> produits, Promotion promotion) {
        this.id = id;
        this.produits = produits;
        this.promotion = promotion;
    }

    public Category() {
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
