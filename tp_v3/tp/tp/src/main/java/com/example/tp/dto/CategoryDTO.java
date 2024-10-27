package com.example.tp.dto;

import java.util.List;

public class CategoryDTO {
    private int id;
    private PromotionDTO promotion;
    private List<ProduitDTO> produits;

    // Constructors
    public CategoryDTO() {
    }

    public CategoryDTO(int id, PromotionDTO promotion, List<ProduitDTO> produits) {
        this.id = id;
        this.promotion = promotion;
        this.produits = produits;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PromotionDTO getPromotion() {
        return promotion;
    }

    public void setPromotion(PromotionDTO promotions) {
        this.promotion = promotions;
    }

    public List<ProduitDTO> getProduits() {
        return produits;
    }

    public void setProduits(List<ProduitDTO> produits) {
        this.produits = produits;
    }
}
