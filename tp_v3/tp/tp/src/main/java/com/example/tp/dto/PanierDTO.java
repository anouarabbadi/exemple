package com.example.tp.dto;

import java.util.List;

public class PanierDTO {
    private int id;
    private List<ProduitDTO> produits;

    public PanierDTO() {
    }

    public PanierDTO(int id, List<ProduitDTO> produits) {
        this.id = id;
        this.produits = produits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ProduitDTO> getProduits() {
        return produits;
    }

    public void setProduits(List<ProduitDTO> produits) {
        this.produits = produits;
    }
}
