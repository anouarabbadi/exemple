package com.example.tp.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "panier")
public class Panier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    @JoinColumn(name = "panier_id")
    private List<Produit> produits;

    // Constructeur sans argument
    public Panier() {
    }

    // Constructeur avec les champs
    public Panier(int id, List<Produit> produits) {
        this.id = id;
        this.produits = produits;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
}